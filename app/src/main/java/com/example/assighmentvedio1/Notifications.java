package com.example.assighmentvedio1;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class Notifications extends Application {
    public static final String CHANEl_1_ID="channel1";
    public static final String CHANEl_2_ID="channel2";

    @Override

    public void onCreate(){
        super.onCreate();
        createNotificationChannel();
    }
    public void createNotificationChannel(){
        NotificationChannel channel1,channel2;
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            channel1 =new NotificationChannel(
                    CHANEl_1_ID,"channel 1",
                    NotificationManager.IMPORTANCE_HIGH
            );
            channel1.setDescription("This is channel 1.");
            channel2=new NotificationChannel(
                    CHANEl_2_ID,"channel 2",
                    NotificationManager.IMPORTANCE_HIGH
            );
            channel2.setDescription("This is channel 2.");
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
            manager.createNotificationChannel(channel2);

        }
    }
}
