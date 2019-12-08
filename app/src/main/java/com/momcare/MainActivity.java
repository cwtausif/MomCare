package com.momcare;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        getSupportActionBar().setTitle("Home");
        weekBtn = findViewById(R.id.weekBtn);
        contactBtn = findViewById(R.id.contactBtn);
        checkBtn = findViewById(R.id.checkBtn);
        rewardBtn = findViewById(R.id.rewardBtn);
        alertBtn = findViewById(R.id.alertBtn);


        weekBtn.setOnClickListener(this);
        contactBtn.setOnClickListener(this);
        checkBtn.setOnClickListener(this);
        rewardBtn.setOnClickListener(this);
        alertBtn.setOnClickListener(this);
    }
}
