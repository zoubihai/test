package com.lingan.gank.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.lingan.gank.R
import com.lingan.gank.bean.Gank

class GankAdapter : RecyclerView.Adapter<GankAdapter.GankViewHolder>() {
   private var list:List<Gank>?=null
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): GankViewHolder {
        val inflate = View.inflate(p0.context, R.layout.item_gank, null)
        return GankViewHolder(inflate)
    }
    fun setNewData(data: List<Gank>) {
        list=data
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int {
        return if (list==null)0 else list!!.size
    }

    override fun onBindViewHolder(gankViewHolder: GankViewHolder, position: Int) {
        Glide.with(gankViewHolder.itemView.context).load(list!![position].url).into(gankViewHolder.image)

    }
    inner class GankViewHolder(view:View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.iv)


    }
}