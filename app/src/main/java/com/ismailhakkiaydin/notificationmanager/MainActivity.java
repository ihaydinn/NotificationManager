package com.ismailhakkiaydin.notificationmanager;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NOTIFICATION_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickNotification(View view){
        NotificationManager mng = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

        Notification.Builder nb = new Notification.Builder(this);
        nb.setContentTitle("INFORMATION");
        nb.setContentText("Starting App");
        nb.setSmallIcon(R.drawable.ic_launcher_foreground);
        nb.setTicker("Notification");
        nb.setAutoCancel(true);
        nb.setLights(Color.RED,1,1);

        Intent intent = new Intent(this, StartAndroid.class);
        PendingIntent pi = PendingIntent.getActivity(this,NOTIFICATION_ID, intent,0);
        nb.setContentIntent(pi);

        Notification not = nb.getNotification();
        not.vibrate=new long []{1000,500,3000,1200};
        mng.notify(NOTIFICATION_ID,not);

    }

}
