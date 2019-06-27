package com.lingan.gank.http

import com.lingan.gank.ApiConstants
import com.lingan.gank.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by zoubihai on 2019/6/27
 */
class ApiClient private constructor(){
    //retrofit单例
    companion object{
        val retrofit: Retrofit by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED){
            val newBuilder = OkHttpClient().newBuilder()
            if (BuildConfig.DEBUG) {
                val httpLoggingInterceptor = HttpLoggingInterceptor()
                httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
                newBuilder.addInterceptor(httpLoggingInterceptor)
            }
                Retrofit.Builder()
                    .baseUrl(ApiConstants.GankHost)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(newBuilder.build())
                    .build()
        }

    }




}