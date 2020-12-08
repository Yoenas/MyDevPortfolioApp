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

class WorksFragment : Fragment() {

    private var itemLists: MutableList<ContactData> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_works, container, false)
        initDataWorks()

//        val worksName = resources.getStringArray(R.array.works_name)
//        val worksLogo = resources.obtainTypedArray(R.array.works_logo)
//        initDataContact(worksName, worksLogo)

        val rvWorks = view.findViewById<RecyclerView>(R.id.rv_works)
//        setupRecyclerView(rvWorks, activity!!.applicationContext)
        rvWorks.adapter = ContactAdapter(itemLists)
        rvWorks.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        return view
    }

    private fun initDataWorks() {
        val name = resources.getStringArray(R.array.works_name)
        val logo = resources.obtainTypedArray(R.array.works_logo)
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