package com.example.view_pager_test_06_04

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.view_pager_test_06_04.databinding.RecyclerViewItemBinding

class RecyclerViewAdapter(val valueList: ArrayList<String>, val viewPager: ViewPager2) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>(){

    inner class RecyclerViewViewHolder(recyclerItemView: View) : RecyclerView.ViewHolder(recyclerItemView)

    lateinit var binding: RecyclerViewItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.recycler_view_item,  parent, false)
        return RecyclerViewViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return 100
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        binding.recyclerTv.text = valueList[position]
        if (viewPager.currentItem == 0) {
            binding.recyclerTv.setTextColor(Color.CYAN)
        }
        else {
            binding.recyclerTv.setTextColor(Color.WHITE)
        }
        binding.recyclerTv.setOnClickListener {
            Log.i("AlfLogs", "currentItem: ${viewPager.currentItem}")
        }
    }
}