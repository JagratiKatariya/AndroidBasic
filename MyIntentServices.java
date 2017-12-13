package com.example.admin.intentapplication;


import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyIntentServices extends IntentService {
    private static final String TAG="com.example.admin.intentapplication";
    public MyIntentServices() {
        super("MyIntentServices");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG,"The Service is started");

    }
}
