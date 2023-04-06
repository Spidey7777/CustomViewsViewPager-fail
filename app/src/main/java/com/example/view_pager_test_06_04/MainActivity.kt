package com.example.view_pager_test_06_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, viewPager)
        viewPager.adapter = adapter
    }
}