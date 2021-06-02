package com.demo.foodmvvm.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.demo.foodmvvm.R
import com.demo.foodmvvm.base.BaseAdapter
import com.demo.foodmvvm.base.BaseViewHolder
import com.demo.foodmvvm.data.model.Categories
import com.demo.foodmvvm.databinding.ItemMealCategoryBinding

class HomeAdapter(
    private val onItemClick: (Categories) -> Unit
) : BaseAdapter<Categories, HomeAdapter.HomeViewHolder>(Categories.diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        HomeViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_meal_category,
                parent,
                false
            ), onItemClick
        )

    class HomeViewHolder(
        private val viewBinding: ItemMealCategoryBinding,
        onClickItem: (Categories) -> Unit
    ) : BaseViewHolder<Categories>(viewBinding, onClickItem) {

        override fun bindData(item: Categories) {
            super.bindData(item)
            viewBinding.category = item
        }
    }
}
