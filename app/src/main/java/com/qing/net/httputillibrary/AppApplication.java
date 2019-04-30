package com.qing.net.httputillibrary;

import android.app.Application;

import com.qing.net.httputillibrary.okHttp.OkhttpProcessor;
import com.qing.net.httputillibrary.httpUtils.HttpHelper;
import com.qing.net.httputillibrary.retrofit.RetrofitProcessor;

/**
 * create by yqli on 2019/4/11
 */
public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpHelper.init(new RetrofitProcessor("http://60.166.12.158:9966/"));
    }
}
