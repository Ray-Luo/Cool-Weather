package com.example.ray.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.ray.coolweather.service.AutoUpdateService;

/**
 * Created by Ray on 10/1/2015.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context,Intent intent)
    {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
