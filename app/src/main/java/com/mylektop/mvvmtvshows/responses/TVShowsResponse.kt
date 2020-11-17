package com.mylektop.mvvmtvshows.responses

import com.google.gson.annotations.SerializedName
import com.mylektop.mvvmtvshows.models.TVShow

/**
 * Created by iddangunawan on 11/17/20
 */
class TVShowsResponse {
    @SerializedName("page")
    val page: Int = 0

    @SerializedName("pages")
    val totalPages: Int = 0

    @SerializedName("tv_shows")
    val tvShows: List<TVShow>? = null
}