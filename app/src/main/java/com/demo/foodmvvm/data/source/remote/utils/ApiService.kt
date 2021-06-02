package com.demo.foodmvvm.data.source.remote.utils

import com.demo.foodmvvm.data.model.CategoryResponse
import com.demo.foodmvvm.utils.APIConfig
import retrofit2.http.GET

interface ApiService {

    @GET(APIConfig.BASE_CATEGORIES)
    suspend fun getCategories(): CategoryResponse
}
