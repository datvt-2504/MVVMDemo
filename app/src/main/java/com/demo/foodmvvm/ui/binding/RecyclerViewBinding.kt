@file:Suppress("UNCHECKED_CAST")

package com.demo.foodmvvm.ui.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.demo.foodmvvm.base.UpdateData

@BindingAdapter("app:data")
fun <T> setDataRecyclerView(recyclerView: RecyclerView, data: List<T>?) {
    if (recyclerView.adapter is UpdateData<*>) {
        (recyclerView.adapter as UpdateData<T>).updateData(data)
    }
}
