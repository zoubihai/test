package com.lingan.gank

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gank_main)
        gankAdapter= GankAdapter()
        rv.adapter=gankAdapter
        initPresenter()
    }

    private fun initPresenter() {
        gankPresente = GankPresente(this)
    }
    override fun getListData(data:MutableList<Gank>) {
       gankAdapter.list= data
    }
}
