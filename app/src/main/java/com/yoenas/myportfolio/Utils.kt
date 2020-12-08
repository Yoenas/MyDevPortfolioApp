/*
package com.yoenas.myportfolio

import android.content.Context
import android.content.res.TypedArray
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yoenas.myportfolio.adapter.ContactAdapter
import com.yoenas.myportfolio.model.ContactData

private var itemLists: MutableList<ContactData> = mutableListOf()

fun initDataContact(name: Array<String>, logo: TypedArray) {
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

fun setupRecyclerView(context: Context, recyclerView: RecyclerView){
    recyclerView.adapter = ContactAdapter(itemLists)
    recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
}*/
