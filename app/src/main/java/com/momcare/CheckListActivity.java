package com.momcare;

import android.os.Bundle;

public class CheckListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list);
        getSupportActionBar().setTitle("Week#25 - Checklist");
        mContext = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
