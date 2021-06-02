package com.demo.foodmvvm.ui.binding

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("app:visibility")
fun setVisibility(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}
