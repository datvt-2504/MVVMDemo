package com.demo.foodmvvm.ui.meal

import com.demo.foodmvvm.base.BaseViewModel
import com.demo.foodmvvm.data.source.repository.CategoryRepository

class MealViewModel(
    private val categoryRepository: CategoryRepository
) : BaseViewModel() {
}
