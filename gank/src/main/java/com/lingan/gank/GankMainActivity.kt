package com.lingan.gank

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.blankj.utilcode.util.ToastUtils
import com.lingan.common.ARouterPath
import com.lingan.gank.adapter.GankAdapter
import com.lingan.gank.bean.Gank
import com.lingan.gank.iview.IGankView
import com.lingan.gank.presente.GankPresente
import kotlinx.android.synthetic.main.activity_gank_main.*

@Route(path = ARouterPath.GANK_MAIN_ACTIVITY)
class GankMainActivity : AppCompatActivity(),IGankView {

    lateinit var gankAdapter: GankAdapter
    lateinit var gankPresente: GankPresente
    override fun onRefreshSearchResult(gankList: List<Gank>) {
        srl.isRefreshing=false
        gankAdapter.setNewData(gankList)
    }

    override fun refreshError(e:Throwable) {
        srl.isRefreshing=false
        ToastUtils.showLong(e.message)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gank_main)
        gankAdapter= GankAdapter()
        rv.adapter=gankAdapter
        srl.setColorSchemeColors(resources.getColor(R.color.colorAccent),resources.getColor(R.color.colorPrimary),resources.getColor(R.color.colorAccent))
        srl.setOnRefreshListener {
            gankPresente.refrshGank()
        }
        initPresenter()
    }

    private fun initPresenter() {
        gankPresente = GankPresente(this)
        gankPresente.refrshGank()
    }

    override fun onDestroy() {
        gankPresente.onDestroy()
        super.onDestroy()
    }
}
