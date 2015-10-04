package com.example.ray.coolweather.util;

/**
 * Created by Ray on 10/2/2015.
 */
public interface HttpCallbackListener {
        void onFinish(String response);
        void onError(Exception e);
}
