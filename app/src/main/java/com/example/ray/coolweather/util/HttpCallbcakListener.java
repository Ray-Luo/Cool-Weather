package com.example.ray.coolweather.util;

/**
 * Created by Ray on 9/27/2015.
 */
public interface HttpCallbcakListener {

    void onFinish(String response);
    void onError(Exception e);
}
