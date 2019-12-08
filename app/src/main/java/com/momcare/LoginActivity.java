package com.momcare;

import android.os.Bundle;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mContext=this;
        getSupportActionBar().hide();
        signupBtn = findViewById(R.id.signupBtn);
        signupBtn.setOnClickListener(this);
    }
}
