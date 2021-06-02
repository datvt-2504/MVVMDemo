package com.demo.foodmvvm.ui.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.demo.foodmvvm.utils.loadImage

@BindingAdapter("app:image")
fun loadImage(imageView: ImageView, url: String?) =
    imageView.loadImage(url)
