package com.momcare;

import android.os.Bundle;

public class AlertsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);
        getSupportActionBar().setTitle("Alerts");
        mContext = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
