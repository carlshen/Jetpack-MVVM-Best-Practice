/*
 * Copyright 2018-present KunMinX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cash.profin.ya.dinero.plata.credit.ui.page.adapter;

import android.content.Context;
import android.graphics.Color;

import androidx.recyclerview.widget.RecyclerView;

import com.kunminx.binding_recyclerview.adapter.SimpleDataBindingAdapter;
import com.cash.profin.ya.dinero.plata.credit.R;
import com.cash.profin.ya.dinero.plata.credit.data.bean.TestAlbum;
import com.cash.profin.ya.dinero.plata.credit.databinding.AdapterPlayItemBinding;
import com.cash.profin.ya.dinero.plata.credit.domain.proxy.PlayerManager;

/**
 * Create by KunMinX at 20/4/19
 */
public class PlaylistAdapter extends SimpleDataBindingAdapter<TestAlbum.TestMusic, AdapterPlayItemBinding> {

    public PlaylistAdapter(Context context) {
        super(context, R.layout.adapter_play_item, DiffUtils.getInstance().getTestMusicItemCallback());
    }

    @Override
    protected void onBindItem(AdapterPlayItemBinding binding, TestAlbum.TestMusic item, RecyclerView.ViewHolder holder) {
        binding.setAlbum(item);
        int currentIndex = PlayerManager.getInstance().getAlbumIndex();
        binding.ivPlayStatus.setColor(currentIndex == holder.getAbsoluteAdapterPosition()
            ? binding.getRoot().getContext().getColor(R.color.gray) : Color.TRANSPARENT);
    }
}
