package com.mylektop.mvvmtvshows.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mylektop.mvvmtvshows.repositories.MostPopularTVShowsRepository
import com.mylektop.mvvmtvshows.responses.TVShowsResponse

/**
 * Created by iddangunawan on 11/17/20
 */
class MostPopularTVShowsViewModel : ViewModel() {

    private var mostPopularTVShowsRepository: MostPopularTVShowsRepository = MostPopularTVShowsRepository()

    fun getMostPopularTVShows(page: Int): LiveData<TVShowsResponse>? {
        return mostPopularTVShowsRepository.getMostPopularTVShows(page)
    }
}