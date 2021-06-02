package com.demo.foodmvvm.di

import com.demo.foodmvvm.data.source.remote.utils.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single { get<Retrofit>().create(ApiService::class.java) }
}
