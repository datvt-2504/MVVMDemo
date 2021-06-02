package com.demo.foodmvvm.ui.meal

import com.demo.foodmvvm.R
import com.demo.foodmvvm.base.BaseFragment
import com.demo.foodmvvm.databinding.FragmentMealBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MealFragment : BaseFragment<FragmentMealBinding, MealViewModel>() {

    override val layoutResource get() = R.layout.fragment_meal
    override val viewModel by viewModel<MealViewModel>()

    override fun initViews() {
    }

    override fun initData() {
    }

    override fun initActions() {
    }

}
