package com.lingan.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.lingan.common.ARouterPath
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_go_gank.setOnClickListener {
            //去看妹子模块
            ARouter.getInstance().build(ARouterPath.GANK_MAIN_ACTIVITY).navigation()

        }
        bt_go_wan_android.setOnClickListener {
            //去wanandroid模块
            ARouter.getInstance().build(ARouterPath.WAN_ANDROID_MAIN_ACTIVITY).navigation()

        }
    }
}
