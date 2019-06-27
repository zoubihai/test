package com.lingan.gank.model

import com.lingan.common.ResultCallBack
import com.lingan.gank.bean.Gank
import com.lingan.gank.bean.GankBean
import com.lingan.gank.http.ApiClient
import com.lingan.gank.service.GankDataService
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class GankModel {
    fun getFuliData(resultCallBack: ResultCallBack<List<Gank>>) {
        var disposable: Disposable?=null
        ApiClient.retrofit.create(GankDataService::class.java).getFuliData(20, 1)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<GankBean> {
                override fun onComplete() {
                    disposable?.dispose()
                }

                override fun onSubscribe(d: Disposable) {
                    disposable=d
                }

                override fun onNext(t: GankBean) {
                    resultCallBack.onSuccess(t.results)
                }

                override fun onError(e: Throwable) {
                    resultCallBack.onFailed(e)
                }

            })

    }
}