package com.leen.module_home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.leen.baselibrary.base.BaseActivity;
import com.leen.baselibrary.util.JumpUtil;

@Route(path=JumpUtil.HomeActivity)
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
