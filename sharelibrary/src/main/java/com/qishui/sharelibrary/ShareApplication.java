package com.qishui.sharelibrary;

import android.app.Application;

import com.qishui.commonlibrary.ISuperApplication;
import com.qishui.commonlibrary.Keys;
import com.qishui.commonlibrary.LogUtils;
import com.qishui.commonlibrary.RouteUtils;

public class ShareApplication extends Application implements ISuperApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    @Override
    public void init(Application application) {

        LogUtils.e("初始化 Share 设置......");

        RouteUtils.getInstance()
                .register(Keys.KEY_ACTIVITY_SHARE, ShareActivity.class);
    }
}
