package com.qishui.commonlibrary;

import android.app.Application;

public interface ISuperApplication {

    String[]apps={"com.qishui.sharelibrary.ShareApplication","com.qishui.zxinglibrary.ZxingApplication"};

    void init(Application application);
}
