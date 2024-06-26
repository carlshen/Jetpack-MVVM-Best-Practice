package com.cash.profin.ya.dinero.plata.credit.domain.message;

import com.cash.profin.ya.dinero.plata.credit.domain.event.Messages;
import com.kunminx.architecture.domain.dispatch.MviDispatcher;

/**
 * TODO:Note 2022.07.04
 *  `
 *  PageMessenger 是一个领域层组件，可用于 "跨页面通信" 场景，
 *  比如跳转到 login 页面完成登录后，login 页面反过来通知其他页面刷新状态，
 * <p>
 * PageMessenger 基于 MVI-Dispatcher 实现可靠的消息回推，
 * 通过消息队列、引用计数等设计，确保 "消息都能被消费，且只消费一次"，
 * 通过内聚设计，彻底杜绝 mutable 滥用等问题，
 * <p>
 * 鉴于本项目场景难发挥 MVI-Dispatcher 潜能，故目前仅以改造 DownloadRequester 和 SharedViewModel 为例，
 * 通过对比 SharedViewModel 和 PageMessenger 易得，后者可简洁优雅实现可靠一致的消息分发，
 * <p>
 * <p>
 * 具体可参见专为 MVI-Dispatcher 编写的领域层案例：
 * <p>
 * https://github.com/KunMinX/MVI-Dispatcher
 * <p>
 * Create by KunMinX at 2022/7/4
 */
public class PageMessenger extends MviDispatcher<Messages> {
    @Override
    protected void onHandle(Messages event) {
        sendResult(event);
    }
}
