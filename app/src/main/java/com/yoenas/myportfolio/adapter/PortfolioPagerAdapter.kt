package com.yoenas.myportfolio.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.yoenas.myportfolio.view.AboutFragment
import com.yoenas.myportfolio.view.ContactFragment
import com.yoenas.myportfolio.view.SkillsFragment
import com.yoenas.myportfolio.view.WorksFragment

class PortfolioPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> AboutFragment()
            1 -> WorksFragment()
            2 -> SkillsFragment()
            3 -> ContactFragment()
            else -> SkillsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "ABOUT"
            1 -> "WORKS"
            2 -> "SKILLS"
            3 -> "CONTACT"
            else -> "SKILLS"
        }
    }
}