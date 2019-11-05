package com.leen.module_splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.leen.baselibrary.base.BaseActivity;
import com.leen.baselibrary.util.JumpUtil;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 跳转页面
         * */
        ARouter.getInstance()
                .build(JumpUtil.HomeActivity) //页面的String值
//                .withString("key",s) //附带参数
                .navigation();
    }
}
