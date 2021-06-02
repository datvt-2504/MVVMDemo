package com.demo.foodmvvm.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VB : ViewDataBinding> : AppCompatActivity() {

    protected var viewBinding: VB? = null
    @get:LayoutRes
    protected abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
        initViews()
    }

    private fun initViewBinding() {
        viewBinding = DataBindingUtil.setContentView(this, layoutId)
        viewBinding?.lifecycleOwner = this
    }

    protected abstract fun initViews()

    override fun onDestroy() {
        super.onDestroy()
        viewBinding = null
    }
}
