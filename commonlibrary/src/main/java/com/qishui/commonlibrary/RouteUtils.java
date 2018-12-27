package com.qishui.commonlibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;

public class RouteUtils {

    private static HashMap<String, Class<? extends Activity>> route = new HashMap<>();
    private static RouteUtils routeUtils;
    public static final String KEY_BUNDLE = "KEY_BUNDLE";

    private RouteUtils() {
    }

    public static RouteUtils getInstance() {
        if (routeUtils == null) {
            synchronized (RouteUtils.class) {
                if (routeUtils == null) {
                    routeUtils = new RouteUtils();
                }
            }
        }
        return routeUtils;
    }

    public RouteUtils register(String path, Class<? extends Activity> clazz) {
        route.put(path, clazz);
        return this;
    }

    public void start(String path) {
        start(path,null);
    }

    public void start(String path, Bundle bundle) {
        Class<? extends Activity> activity = route.get(path);
        if (activity == null) {
            return;
        }

        Log.e("Tag",activity.getName());

        Context context = BaseAppliction.getContext();
        Intent intent = new Intent();
        intent.setClass(context,activity);
        if (bundle != null) {
            intent.putExtra(KEY_BUNDLE, bundle);
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

    }

}
