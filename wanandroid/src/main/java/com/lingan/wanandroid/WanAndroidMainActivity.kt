package com.lingan.wanandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.lingan.common.ARouterPath

@Route(path = ARouterPath.WAN_ANDROID_MAIN_ACTIVITY)
class WanAndroidMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wan_android_main)
    }
}
