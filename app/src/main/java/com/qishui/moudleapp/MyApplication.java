package com.qishui.moudleapp;

import com.qishui.commonlibrary.BaseAppliction;
import com.qishui.commonlibrary.Keys;
import com.qishui.commonlibrary.RouteUtils;

public class MyApplication extends BaseAppliction {

    @Override
    public void onCreate() {
        super.onCreate();

        RouteUtils.getInstance()
                .register(Keys.KEY_ACTIVITY_MAIN, MainActivity.class)
                .register(Keys.KEY_ACTIVITY_MAIN2, Main2Activity.class);
    }
}
