package com.momcare;

import android.os.Bundle;

public class VideosActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        getSupportActionBar().setTitle("Week#1 - Videos");
        mContext = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}



