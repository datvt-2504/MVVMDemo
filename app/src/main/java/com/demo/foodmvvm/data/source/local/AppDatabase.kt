package com.demo.foodmvvm.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.demo.foodmvvm.data.model.Meals
import com.demo.foodmvvm.data.source.local.AppDatabase.Companion.DATABASE_VERSION
import com.demo.foodmvvm.data.source.local.AppDatabase.Companion.EXPORT_SCHEME
import com.demo.foodmvvm.data.source.local.dao.MealsDao

@Database(
    entities = [Meals::class],
    version = DATABASE_VERSION,
    exportSchema = EXPORT_SCHEME
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun mealDao(): MealsDao

    companion object {
        const val DATABASE_NAME = "FoodMVVM"
        const val DATABASE_VERSION = 1
        const val EXPORT_SCHEME = false
    }
}
