package com.lingan.gank.iview

import com.lingan.gank.bean.Gank

interface IGankView {
    fun onRefreshSearchResult(gankList: List<Gank>)
    fun refreshError(e:Throwable)
}