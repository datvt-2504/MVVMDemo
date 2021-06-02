package com.demo.foodmvvm.di

import androidx.room.Room
import com.demo.foodmvvm.data.source.CategoriesDatasource
import com.demo.foodmvvm.data.source.local.AppDatabase
import com.demo.foodmvvm.data.source.local.AppDatabase.Companion.DATABASE_NAME
import com.demo.foodmvvm.data.source.remote.CategoriesRemoteDatasource
import com.demo.foodmvvm.data.source.repository.CategoryRepository
import com.demo.foodmvvm.data.source.repository.CategoryRepositoryImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dbLocalModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            DATABASE_NAME
        ).build()
    }
    single { get<AppDatabase>().mealDao() }
}

val repositoryModule = module {
    single<CategoriesDatasource> { CategoriesRemoteDatasource(get()) }
    single<CategoryRepository> { CategoryRepositoryImpl(get()) }
}
