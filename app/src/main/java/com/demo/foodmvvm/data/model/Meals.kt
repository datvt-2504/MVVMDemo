package com.demo.foodmvvm.data.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "meal")
data class Meals(
    @SerializedName("idMeal")
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @SerializedName("strMeal")
    @ColumnInfo(name = "strMeal")
    val strMeal: String,
    @SerializedName("strMealThumb")
    @ColumnInfo(name = "strMealThumb")
    val strMealThumb: String
) : Parcelable {

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Meals>() {
            override fun areItemsTheSame(oldItem: Meals, newItem: Meals) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Meals, newItem: Meals) =
                oldItem == newItem
        }
    }
}
