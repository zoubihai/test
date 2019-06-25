package com.lingan.gank.bean

data class GankBean(
    val error: Boolean,
    val results: List<Gank>
)

 data class Gank(
    val _id: String,
    val createdAt: String,
    val desc: String,
    val publishedAt: String,
    val source: String,
    val type: String,
    val url: String,
    val used: Boolean,
    val who: String
)