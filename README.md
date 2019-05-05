# HttpUtilLibrary
可切换的网络框架，okhttp,retrofit，可加入其它的网络框架实现
库中有一个定义的post方法，可根据产品需求自行添加方法
as引用 implementation project(path: ':httputillibray')

Application中初始化：
           1.retrofit
                HttpHelper.init(new RetrofitProcessor(url));
           2.okhttp
                HttpHelper.init(new OkhttpProcessor();
                
调用示例：
         Map<String ,Object> map=new HashMap<>();
         
        HttpHelper.instance().post(url, map, new HttpCallBack<MyResponse>() {
            @Override
            public void onSuccess(MyResponse result) {
                Log.i(TAG, "onSuccess: "+result.getResponse());
                Toast.makeText(getApplicationContext(),result.getResponse()+"",Toast.LENGTH_LONG).show();
            }
        });
