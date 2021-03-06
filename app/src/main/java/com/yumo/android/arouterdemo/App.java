package com.yumo.android.arouterdemo;

import android.app.Application;
import android.os.Build;

import com.alibaba.android.arouter.launcher.ARouter;
import com.didichuxing.doraemonkit.DoraemonKit;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG){
            ARouter.openDebug();
            ARouter.openLog();
        }

        ARouter.init(this);
        DoraemonKit.install(this);
    }
}
