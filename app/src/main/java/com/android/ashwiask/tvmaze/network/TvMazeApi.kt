package com.android.ashwiask.tvmaze.network

import com.android.ashwiask.tvmaze.network.home.Episode
import com.android.ashwiask.tvmaze.network.home.Show
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface TvMazeApi {
    @GET("/schedule")
    fun getCurrentSchedule(
        @Query("country") country: String,
        @Query("date") date: String
    ): Single<List<Episode>>


    @GET("/shows")
    suspend fun getShows(@Query("page") pageNumber: Int): List<Show>
}