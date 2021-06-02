package com.demo.foodmvvm.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.demo.foodmvvm.utils.showToast

abstract class BaseFragment<VB : ViewDataBinding, VM : BaseViewModel> : Fragment() {

    @get:LayoutRes
    protected abstract val layoutResource: Int
    protected abstract val viewModel: VM
    protected var dataBinding: VB? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = DataBindingUtil
        .inflate<VB>(inflater, layoutResource, container, false)
        .apply { dataBinding = this }
        .root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeViewModel()
        initViews()
        initData()
        initActions()
    }

    protected abstract fun initViews()

    protected abstract fun initData()

    protected abstract fun initActions()

    protected open fun observeViewModel() = with(viewModel) {
        isLoading.observe(viewLifecycleOwner, Observer(::handleLoading))
        message.observe(viewLifecycleOwner, Observer {
            hideLoading()
            if (it.isNullOrBlank().not()) {
                context?.showToast(it)
            }
        })
    }

    private fun handleLoading(isLoading: Boolean?) =
        if (isLoading == true) showLoading() else hideLoading()

    open fun showLoading() {}

    open fun hideLoading() {}

    override fun onDestroy() {
        super.onDestroy()
        dataBinding = null
    }
}
