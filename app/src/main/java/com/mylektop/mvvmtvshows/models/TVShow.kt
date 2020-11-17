package com.mylektop.mvvmtvshows.models

import com.google.gson.annotations.SerializedName

/**
 * Created by iddangunawan on 11/17/20
 */
class TVShow {
    @SerializedName("id")
    private val id: Int = 0

    @SerializedName("name")
    private val name: String? = null

    @SerializedName("permalink")
    private val permalink: String? = null

    @SerializedName("start_date")
    private val startDate: String? = null

    @SerializedName("end_date")
    private val endDate: String? = null

    @SerializedName("country")
    private val country: String? = null

    @SerializedName("network")
    private val network: String? = null

    @SerializedName("status")
    private val status: String? = null

    @SerializedName("image_thumbnail_path")
    private val thumbnail: String? = null
}