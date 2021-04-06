package com.brendon.listacontatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var listener: ClickItemContactListener) : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>(){

    private val list: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactAdapterViewHolder(view, list, listener)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun updateList(list: List<Contact>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class ContactAdapterViewHolder(itemview: View, var list: List<Contact>, var listener: ClickItemContactListener) : RecyclerView.ViewHolder(itemview){
        private val tvName: TextView = itemview.findViewById(R.id.tv_name)
        private val tvPhone: TextView = itemview.findViewById(R.id.tv_phone)
        private val tvPhotograph: ImageView = itemview.findViewById(R.id.iv_photograph)

        init {
            itemview.setOnClickListener{
                listener.clickItemContact(list[adapterPosition])
            }
        }

        fun bind(contact: Contact){
            tvName.text = contact.name
            tvPhone.text = contact.phone
        }
    }
}