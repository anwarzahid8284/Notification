package com.example.assighmentvedio1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.assighmentvedio1.Notifications.CHANEl_1_ID;
import static com.example.assighmentvedio1.Notifications.CHANEl_2_ID;

public class MainActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationCompat;
    private EditText title,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=(EditText) findViewById(R.id.title);
        message=(EditText)findViewById(R.id.message);
        notificationCompat=NotificationManagerCompat.from(this);
    }
    public  void sendChannel1(View view){
        String titleValue=title.getText().toString().trim();
        String messageValue=message.getText().toString().trim();
       Notification notification=new  NotificationCompat.Builder(MainActivity.this,CHANEl_1_ID).
               setSmallIcon(R.drawable.noftificationicon)
               .setContentTitle(titleValue)
               .setContentText(messageValue)
               .setPriority(NotificationCompat.PRIORITY_HIGH)
               .setCategory(NotificationCompat.CATEGORY_MESSAGE).build();
        notificationCompat.notify(1,notification);

    }
    public void sendChannel2(View view){
        String titleValue=title.getText().toString().trim();
        String messageValue=message.getText().toString().trim();
        Notification notification=new  NotificationCompat.Builder(MainActivity.this,CHANEl_2_ID).
                setSmallIcon(R.drawable.noftificationicon)
                .setContentTitle(titleValue)
                .setContentText(messageValue)
                .setPriority(NotificationCompat.PRIORITY_LOW).build();
        notificationCompat.notify(2,notification);
    }
}
