package com.qishui.moudleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.qishui.commonlibrary.Keys;
import com.qishui.commonlibrary.RouteUtils;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void click(View view) {
        RouteUtils.getInstance().start(Keys.KEY_ACTIVITY_MAIN);
    }
}
