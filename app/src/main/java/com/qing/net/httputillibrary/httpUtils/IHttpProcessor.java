package com.qing.net.httputillibrary.httpUtils;

import com.qing.net.httputillibrary.callBack.Icallback;

import java.util.Map;

/**
 * create by yqli on 2019/4/11
 */
public interface IHttpProcessor {
    void post(String url, Map<String,Object> params, Icallback callback);
}
