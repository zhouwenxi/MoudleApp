package com.qishui.commonlibrary;

import android.app.Application;
import android.content.Context;

public class BaseAppliction extends Application implements ISuperApplication {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this;
        init(this);
    }

    public static Context getContext() {
        return context;
    }

    @Override
    public void init(Application application) {

        for (String app : apps) {
            try {
                Class clazz = Class.forName(app);
                Object o = clazz.newInstance();
                if (o instanceof ISuperApplication) {
                    ((ISuperApplication) o).init(application);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }


    }
}
