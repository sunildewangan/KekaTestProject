package com.test.sampleapp.data.api

import com.test.sampleapp.data.model.MainObject
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("arts.json")
    suspend fun getUsers(@Query("api-key") apikey:String): MainObject
}