package com.example.view_pager_test_06_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.view_pager_test_06_04.databinding.FragmentViewPagerLayoutBinding

class ViewPagerFragment(val position: Int, val viewPager: ViewPager2) : Fragment() {

    lateinit var binding: FragmentViewPagerLayoutBinding
    val valueList = ArrayList<String>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_view_pager_layout, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        binding.dummyTv.text = position.toString().repeat(10)
        for (i in 0 until 100) {
            valueList.add("$position")
        }
        val adapter = RecyclerViewAdapter(valueList, viewPager)
        val layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerview.layoutManager = layoutManager
        binding.recyclerview.adapter = adapter
    }
}