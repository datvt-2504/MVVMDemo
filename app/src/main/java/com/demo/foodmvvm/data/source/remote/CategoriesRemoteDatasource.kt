package com.demo.foodmvvm.data.source.remote

import com.demo.foodmvvm.data.source.CategoriesDatasource
import com.demo.foodmvvm.data.source.remote.utils.ApiService

class CategoriesRemoteDatasource(
    private val apiService: ApiService
) : CategoriesDatasource {

    override suspend fun getCategories() = apiService.getCategories()

}
