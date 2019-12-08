package com.momcare;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    Context mContext;
    Button signupBtn;
    ImageButton weekBtn,contactBtn,alertBtn,checkBtn,rewardBtn;

    public void gotoActivity(Class activity,boolean isFinish){
        Intent intent = new Intent(mContext,activity);
        startActivity(intent);
        if (isFinish){
            finish();
        }
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.signupBtn:
                gotoActivity(MainActivity.class,true);
                break;
            case R.id.weekBtn:
            gotoActivity(VideosActivity.class,false);
            break;
            case R.id.contactBtn:
                //gotoActivity(MainActivity.class,true);
                break;
            case R.id.alertBtn:
                gotoActivity(AlertsActivity.class,false);
                break;
            case R.id.checkBtn:
                gotoActivity(CheckListActivity.class,false);
                break;
            case R.id.rewardBtn:
                gotoActivity(AdvertisementActivity.class,false);
                break;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //do whatever
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
