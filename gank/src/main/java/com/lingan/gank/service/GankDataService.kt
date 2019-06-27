package com.lingan.gank.service

import com.lingan.gank.bean.GankBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by zoubihai on 2019/6/27
 */
interface GankDataService {
    @GET("api/data/福利/{size}/{index}")
    fun getFuliData(@Path("size") size:Int,@Path("index") index :Int):Observable<GankBean>

}