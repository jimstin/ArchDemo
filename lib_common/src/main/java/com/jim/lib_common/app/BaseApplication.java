package com.jim.lib_common.app;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if(isDebug()) {
//            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    private boolean isDebug() {
        return true;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
