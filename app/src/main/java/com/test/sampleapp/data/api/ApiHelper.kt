package com.test.sampleapp.data.api

class ApiHelper(private val apiService: ApiService) {
    suspend fun getUsers(apiKey:String) = apiService.getUsers(apiKey)
}