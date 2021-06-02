package com.demo.foodmvvm.data.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Categories(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("strCategoryThumb") val strCategoryThumb: String,
    @SerializedName("strCategoryDescription") val strCategoryDescription: String
) : Parcelable {

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Categories>() {
            override fun areItemsTheSame(oldItem: Categories, newItem: Categories) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Categories, newItem: Categories) =
                oldItem == newItem
        }
    }
}
