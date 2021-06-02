package com.demo.foodmvvm.di

import com.demo.foodmvvm.ui.home.HomeViewModel
import com.demo.foodmvvm.ui.meal.MealViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { MealViewModel(get()) }
}
