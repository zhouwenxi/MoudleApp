package com.qishui.zxinglibrary;

import android.app.Application;

import com.qishui.commonlibrary.ISuperApplication;
import com.qishui.commonlibrary.Keys;
import com.qishui.commonlibrary.LogUtils;
import com.qishui.commonlibrary.RouteUtils;

public class ZxingApplication extends Application implements ISuperApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    @Override
    public void init(Application application) {

        LogUtils.e("初始化 Zxing 设置......");
        RouteUtils.getInstance().register(Keys.KEY_ACTIVITY_ZXING, ZxingActivity.class);
    }
}
