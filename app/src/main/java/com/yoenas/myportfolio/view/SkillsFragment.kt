package com.yoenas.myportfolio.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yoenas.myportfolio.R
import com.yoenas.myportfolio.adapter.ContactAdapter
import com.yoenas.myportfolio.model.ContactData

class SkillsFragment : Fragment() {

    private var itemLists: MutableList<ContactData> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_skills, container, false)
        initDataSkills()
//        val skillsName = resources.getStringArray(R.array.skills_name)
//        val skillsLogo = resources.obtainTypedArray(R.array.skills_logo)
//        initDataContact(skillsName, skillsLogo)

        val rvSkills = view.findViewById<RecyclerView>(R.id.rv_skills)
//        setupRecyclerView(rvSkills, activity!!.applicationContext)
        rvSkills.adapter = ContactAdapter(itemLists)
        rvSkills.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        return view
    }

    private fun initDataSkills() {
        val name = resources.getStringArray(R.array.skills_name)
        val logo = resources.obtainTypedArray(R.array.skills_logo)
        itemLists.clear()

        for (i in name.indices) {
            itemLists.add(
                ContactData(
                    name[i],
                    logo.getResourceId(i, 0)
                )
            )
        }
        logo.recycle()
    }
}