package com.leen.aroutertest.application;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.leen.aroutertest.BuildConfig;

/**
 * @author 创建人：Administrator
 * 创建日期：2019/11/5
 * 描述：
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initARouter(this);
    }
    private void initARouter(MyApplication myApplication){
        if (BuildConfig.DEBUG){
            ARouter.openDebug();//开启调试模式（如果在InstantRun模式下必须开启）
            ARouter.openLog();//开启打印日志
        }
        ARouter.init(myApplication);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }
}
