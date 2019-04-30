package com.qing.net.httputillibrary.retrofit;

import com.qing.net.httputillibrary.MyResponse;
import com.qing.net.httputillibrary.callBack.Icallback;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * create by yqli on 2019/4/30
 */
public interface ApiService {

    @POST("api/static/")
    Observable<MyResponse> post(@QueryMap Map<String, Object> params, @Query("platName") String platName);
}
