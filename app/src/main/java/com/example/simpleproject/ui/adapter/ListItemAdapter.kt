package com.example.simpleproject.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.simpleproject.R
import com.example.simpleproject.databinding.ItemListBinding
import com.example.simpleproject.model.Person

class ListItemAdapter(var items:List<Person>):RecyclerView.Adapter<ListItemAdapter.ViewHolder>(){

    class ViewHolder(var viewDataBinding: ItemListBinding):RecyclerView.ViewHolder(viewDataBinding.root){

        fun binding(person: Person){
            viewDataBinding.person= person
            viewDataBinding.invalidateAll()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewDataBinding:ItemListBinding=
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_list,parent,false)

        return ViewHolder(viewDataBinding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(items[position])

        holder.itemView.setOnClickListener {
            onItemClickListener?.onItemClick(position, items[position])
        }
    }

    // here to click listener
    var onItemClickListener: OnItemClickListener? = null
    interface OnItemClickListener {
        fun onItemClick(position: Int, person: Person)
    }
}