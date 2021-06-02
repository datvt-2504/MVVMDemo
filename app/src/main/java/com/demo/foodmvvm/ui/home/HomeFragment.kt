package com.demo.foodmvvm.ui.home

import androidx.navigation.fragment.findNavController
import com.demo.foodmvvm.R
import com.demo.foodmvvm.base.BaseFragment
import com.demo.foodmvvm.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    private val categoryAdapter by lazy {
        HomeAdapter {
            findNavController().navigate(HomeFragmentDirections.actionNavigationHomeToMealFragment())
        }
    }

    override val layoutResource get() = R.layout.fragment_home
    override val viewModel by viewModel<HomeViewModel>()

    override fun initViews() {
        dataBinding?.apply {
            lifecycleOwner = viewLifecycleOwner
            homeVM = viewModel
            recyclerViewMealCategory.adapter = categoryAdapter
        }
    }

    override fun initData() {
    }

    override fun initActions() {
    }
}
