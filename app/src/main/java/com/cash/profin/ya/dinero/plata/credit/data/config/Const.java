package com.cash.profin.ya.dinero.plata.credit.data.config;

import android.os.Environment;

import com.kunminx.architecture.utils.Utils;
import com.cash.profin.ya.dinero.plata.credit.R;
/**
 * Create by KunMinX at 2022/8/18
 */
public class Const {
    public static final String COVER_PATH = Utils.getApp().getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath();
    public static final String COLUMN_LINK = Utils.getApp().getString(R.string.article_navigation);
    public static final String PROJECT_LINK = Utils.getApp().getString(R.string.github_project);
}
