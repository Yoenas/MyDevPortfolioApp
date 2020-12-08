package com.yoenas.myportfolio.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yoenas.myportfolio.R
import com.yoenas.myportfolio.model.ContactData

class SkillsAdapter(private val itemList: List<ContactData>) : RecyclerView.Adapter<SkillsAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem = view.findViewById<TextView>(R.id.tv_item)
        val imgItem = view.findViewById<ImageView>(R.id.img_item)

        fun bindItem(item: ContactData){
            tvItem.text = item.name
            Glide.with(itemView.context).load(item.image).into(imgItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_layout, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItem(itemList[position])
    }

    override fun getItemCount() = itemList.size

}