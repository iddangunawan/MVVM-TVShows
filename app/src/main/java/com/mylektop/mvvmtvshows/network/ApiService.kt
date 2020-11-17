package com.mylektop.mvvmtvshows.network

import com.mylektop.mvvmtvshows.responses.TVShowsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by iddangunawan on 11/17/20
 */
interface ApiService {

    @GET("most-popular")
    fun getMostPopularTVShows(@Query("page") page: Int): Call<TVShowsResponse>
}