package kz.android.lab2.api

import kz.android.lab2.model.MAIN
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface APIService {
    @Headers("X-Api-Key:Os7QxmF9+7JOYui8E/LobA==MySTp0bqVfuQirHW")
    @GET("dogs")
    fun getDogBreedByName(@Query("name") name: String): Call<List<MAIN>>
}