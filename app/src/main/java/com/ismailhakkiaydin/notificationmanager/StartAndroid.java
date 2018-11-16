package com.ismailhakkiaydin.notificationmanager;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class StartAndroid extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt = new TextView(this);
        txt.setText("Android system is starting, I'm Android Phone...");
        setContentView(txt);

    }
}
