package com.demo.foodmvvm.data.source.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.demo.foodmvvm.data.model.Meals

@Dao
interface MealsDao {
    @Query("SELECT * FROM meal ")
    suspend fun getMeals(): List<Meals>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeal(meal: Meals)

    @Query("DELETE FROM meal WHERE id = :id")
    suspend fun deleteMeal(id: String)
}
