package com.demo.foodmvvm.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.demo.foodmvvm.base.BaseViewModel
import com.demo.foodmvvm.data.model.Categories
import com.demo.foodmvvm.data.source.repository.CategoryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(
    private val categoryRepository: CategoryRepository
) : BaseViewModel() {

    init {
        getCategories()
    }

    private val _categories = MutableLiveData<List<Categories>>()
    val categories: LiveData<List<Categories>>
        get() = _categories

    private fun getCategories() {
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val categoriesFromApi = categoryRepository.getCategories()
            _categories.postValue(categoriesFromApi.categories)
        }
    }
}
