package com.demo.foodmvvm

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.demo.foodmvvm.base.BaseActivity
import com.demo.foodmvvm.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutId get() = R.layout.activity_main

    override fun initViews() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentNavHost) as NavHostFragment
        val navController = navHostFragment.navController
        viewBinding?.bottomNavigationView?.setupWithNavController(navController)
    }
}
