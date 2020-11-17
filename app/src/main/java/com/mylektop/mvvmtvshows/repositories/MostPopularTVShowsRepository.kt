package com.mylektop.mvvmtvshows.repositories

import androidx.annotation.NonNull
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mylektop.mvvmtvshows.network.ApiClient
import com.mylektop.mvvmtvshows.network.ApiService
import com.mylektop.mvvmtvshows.responses.TVShowsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by iddangunawan on 11/17/20
 */
class MostPopularTVShowsRepository {

    private var apiService: ApiService? = ApiClient.getRetrofit()?.create(ApiService::class.java)

    fun getMostPopularTVShows(page: Int): LiveData<TVShowsResponse> {
        val data: MutableLiveData<TVShowsResponse> = MutableLiveData()

        apiService?.getMostPopularTVShows(page)?.enqueue(object : Callback<TVShowsResponse> {
            override fun onResponse(@NonNull call: Call<TVShowsResponse>, @NonNull response: Response<TVShowsResponse>) {
                data.value = response.body()
            }

            override fun onFailure(@NonNull call: Call<TVShowsResponse>, @NonNull t: Throwable) {
                data.value = null
            }
        })

        return data
    }
}