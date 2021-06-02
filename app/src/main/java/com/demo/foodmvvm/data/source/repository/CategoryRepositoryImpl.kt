package com.demo.foodmvvm.data.source.repository

import com.demo.foodmvvm.data.source.CategoriesDatasource

class CategoryRepositoryImpl(
    private val remote: CategoriesDatasource
) : CategoryRepository {

    override suspend fun getCategories() = remote.getCategories()
}
