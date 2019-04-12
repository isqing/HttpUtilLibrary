package com.qing.net.httputillibrary;

import android.app.Application;

/**
 * create by yqli on 2019/4/11
 */
public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpHelper.init(new OkhttpProcessor());
    }
}
