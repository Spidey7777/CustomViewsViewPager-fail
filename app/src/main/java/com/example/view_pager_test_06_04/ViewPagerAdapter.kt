package com.example.view_pager_test_06_04

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class ViewPagerAdapter(supportFragmentManager: FragmentManager, lifecycle: Lifecycle, val viewPager: ViewPager2) : FragmentStateAdapter(supportFragmentManager, lifecycle){
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        Log.i("AlfLogs", "createFragment called - position: $position")
        return ViewPagerFragment(position, viewPager)
    }

}