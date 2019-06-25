package com.lingan.gank.presente

import com.lingan.gank.iview.IGankView
import com.lingan.gank.model.GankModel
import java.lang.ref.WeakReference

class GankPresente(iGankView: IGankView){
    //1.持有view跟model的引用
   private var mGankModel: GankModel = GankModel()
    //2.使用弱引用持有view
   private val weakReference=WeakReference(iGankView)


    //3.移除view的引用
    fun onDestroy() {
        weakReference.clear()
    }
    //4.获取数据

}