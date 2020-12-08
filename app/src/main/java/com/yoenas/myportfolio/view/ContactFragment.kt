package com.yoenas.myportfolio.view

import android.content.res.TypedArray
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

class ContactFragment : Fragment() {

    private var itemLists: MutableList<ContactData> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_contact, container, false)
        initDataContact()

//        val name = resources.getStringArray(R.array.contact_data)
//        val logo = resources.obtainTypedArray(R.array.contact_logo_image)
//        initDataContact(name, logo)

        val rvContact = view.findViewById<RecyclerView>(R.id.rv_contact)
//        setupRecyclerView(rvSkills, activity!!.applicationContext)

        rvContact.adapter = ContactAdapter(itemLists)
        rvContact.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        return view
    }

    private fun initDataContact() {
        val name = resources.getStringArray(R.array.contact_data)
        val logo = resources.obtainTypedArray(R.array.contact_logo_image)
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