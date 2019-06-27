package com.lingan.common

/**
 * Created by zoubihai on 2019/6/27
 */
interface ResultCallBack <T>{
    fun onSuccess(t: T)
    fun onFailed(throwable: Throwable)
}