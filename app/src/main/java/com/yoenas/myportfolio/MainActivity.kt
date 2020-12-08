package com.yoenas.myportfolio

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.yoenas.myportfolio.adapter.PortfolioPagerAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        viewPager.adapter = PortfolioPagerAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.setTabTextColors(Color.GRAY, Color.parseColor("white"))

        val tvGetInTouch = findViewById<TextView>(R.id.tv_get_in_touch)
        tvGetInTouch.setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"+6281224347817")))
        }
    }
}