package com.qing.net.httputillibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String TAG=this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map<String ,Object> map=new HashMap<>();
        HttpHelper.instance().post("http://60.166.12.158:9966/api/static?platName=sdk_test", map, new HttpCallBack<MyResponse>() {
            @Override
            public void onSuccess(MyResponse result) {
                Log.i(TAG, "onSuccess: "+result.getResponse());
            }
        });
    }
}
