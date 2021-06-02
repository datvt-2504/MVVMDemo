package com.demo.foodmvvm.data.source.repository

import com.demo.foodmvvm.data.model.CategoryResponse

interface CategoryRepository {
    suspend fun getCategories(): CategoryResponse
}
