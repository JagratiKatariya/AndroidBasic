package com.example.admin.intentapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG="com.example.admin.intentapplication";
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"Service started");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"Service destroyed");
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=5;i++)
                {
                    long futuretime = System.currentTimeMillis()+5000;
                    while (System.currentTimeMillis()<futuretime)
                    {
                       synchronized (this)
                       {
                           try {
                               wait(futuretime-System.currentTimeMillis());
                               Log.i(TAG,"Service running");
                           }catch (Exception e){}
                       }
                    }
                }
            }
        };
        Thread MyThread=new Thread(r);
        MyThread.start();
        return Service.START_STICKY;
    }
}
