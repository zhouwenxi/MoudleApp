package com.qishui.sharelibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.qishui.commonlibrary.Keys;
import com.qishui.commonlibrary.RouteUtils;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    public void click1(View view) {
        RouteUtils.getInstance().start(Keys.KEY_ACTIVITY_MAIN);
    }

    public void click2(View view) {
        RouteUtils.getInstance().start(Keys.KEY_ACTIVITY_ZXING);
    }
}
