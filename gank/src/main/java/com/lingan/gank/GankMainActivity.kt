package com.lingan.gank

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.lingan.common.ARouterPath

@Route(path = ARouterPath.GANK_MAIN_ACTIVITY)
class GankMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gank_main)
    }
}
