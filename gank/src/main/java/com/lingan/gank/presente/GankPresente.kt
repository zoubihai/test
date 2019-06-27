package com.lingan.gank.presente

import com.lingan.common.ResultCallBack
import com.lingan.gank.bean.Gank
import com.lingan.gank.iview.IGankView
import com.lingan.gank.model.GankModel
import java.lang.ref.WeakReference

class GankPresente(iGankView: IGankView){
    //1.持有view跟model的引用
   private var mGankModel: GankModel = GankModel()
    //2.使用弱引用持有view
    private val iGankView=iGankView
   private val weakReference=WeakReference(iGankView)


    //3.移除view的引用
    fun onDestroy() {
        weakReference.clear()
    }
    //4.获取数据
    fun refrshGank() {
       mGankModel.getFuliData(object :ResultCallBack<List<Gank>>{
           override fun onSuccess(t: List<Gank>) {
               iGankView.onRefreshSearchResult(t)
           }

           override fun onFailed(throwable: Throwable) {
               iGankView.refreshError(throwable)
           }
       })
    }

}