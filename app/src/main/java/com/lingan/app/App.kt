package com.lingan.app

import com.alibaba.android.arouter.launcher.ARouter
import com.lingan.common.BaseApplication

class App:BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {           // These two lines must be written before init, otherwise these configurations will be invalid in the init process
            ARouter.openLog()   // Print log
            ARouter.openDebug()  // Turn on debugging mode (If you are running in InstantRun mode, you must turn on debug mode! Online version needs to be closed, otherwise there is a security risk)
        }
        ARouter.init(this)
    }
}