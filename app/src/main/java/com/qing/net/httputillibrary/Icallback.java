package com.qing.net.httputillibrary;

/**
 * create by yqli on 2019/4/11
 */
public interface Icallback {
    void successful(String response);
    void fail(Error error);
}
