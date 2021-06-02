package com.demo.foodmvvm.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.cancel

abstract class BaseViewModel : ViewModel() {

    private val _isLoading = MutableLiveData<Boolean>().apply { value = false }
    val isLoading: LiveData<Boolean>
        get() = _isLoading
    private val _message = MutableLiveData<String>()
    val message: LiveData<String>
        get() = _message

    protected val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        _message.value = throwable.message
    }

    fun showLoading() {
        _isLoading.value = true
    }

    fun hideLoading() {
        _isLoading.value = false
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}
