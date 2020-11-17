package com.mylektop.mvvmtvshows.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mylektop.mvvmtvshows.R
import com.mylektop.mvvmtvshows.viewmodels.MostPopularTVShowsViewModel

class MainActivity : AppCompatActivity() {

    private var viewModel: MostPopularTVShowsViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MostPopularTVShowsViewModel::class.java)
        getMostPopularTVShows()
    }

    private fun getMostPopularTVShows() {
        viewModel?.getMostPopularTVShows(0)?.observe(this, { mostPopularTVShowsResponse ->
            Toast.makeText(applicationContext, "Total Pages: ${mostPopularTVShowsResponse?.totalPages}", Toast.LENGTH_SHORT).show()
        })
    }
}