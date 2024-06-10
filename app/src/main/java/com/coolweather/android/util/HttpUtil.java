package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    //一个Callback接口的对象，用于处理网络请求的响应结果。当请求成功、失败或者响应有进度更新时，OkHttp会通过这个callback回调相应的方法。
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request =new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

        //client.newCall(request): 使用OkHttpClient对象的newCall方法，传入刚刚构建的Request对象，创建一个Call对象。Call代表一个待执行的HTTP请求。
        //.enqueue(callback): 对Call对象调用enqueue方法来异步执行请求。这意味着请求将在后台线程开始，并不会阻塞当前线程。当请求完成后，callback的相应方法会在主线程被调用
        // 因此可以在这里安全地更新UI或进行其他需要在主线程操作的任务。
    }
}
