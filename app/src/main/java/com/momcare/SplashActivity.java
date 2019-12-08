package com.momcare;

import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        mContext = this;
        setContentView(R.layout.activity_splash);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                gotoActivity(LoginActivity.class,true);
            }
        },1000);

    }
}
