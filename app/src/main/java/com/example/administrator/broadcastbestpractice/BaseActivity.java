package com.example.administrator.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016/7/8 0008.
 */
public class BaseActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ACtivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ACtivityCollector.removeActivity(this);
    }
}
