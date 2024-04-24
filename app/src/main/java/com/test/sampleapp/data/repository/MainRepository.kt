package com.test.sampleapp.data.repository

import com.test.sampleapp.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers(apiKey:String) = apiHelper.getUsers(apiKey)
}