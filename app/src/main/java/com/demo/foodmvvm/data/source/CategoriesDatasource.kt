package com.demo.foodmvvm.data.source

import com.demo.foodmvvm.data.model.CategoryResponse

interface CategoriesDatasource {
    suspend fun getCategories(): CategoryResponse
}
