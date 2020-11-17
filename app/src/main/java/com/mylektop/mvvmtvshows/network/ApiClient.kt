package com.mylektop.mvvmtvshows.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by iddangunawan on 11/17/20
 */
class ApiClient {

    companion object {
        private var retrofit: Retrofit? = null

        fun getRetrofit(): Retrofit? {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl("https://www.episodate.com/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
    }
}