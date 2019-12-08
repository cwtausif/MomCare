package com.momcare;

import android.os.Bundle;

public class AdvertisementActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertisement);
        getSupportActionBar().setTitle("Week#1 - EarnPoints");
        mContext = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
