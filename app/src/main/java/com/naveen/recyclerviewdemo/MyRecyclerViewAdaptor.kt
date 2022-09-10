package com.naveen.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdaptor(val fruitsList:List<Fruit>) : RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitsList[position]
       holder.bind(fruit)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }
}

class MyViewHolder(val view:View):RecyclerView.ViewHolder(view){
    fun bind(fruit:Fruit){
        val myTextView = view.findViewById<TextView>(R.id.tvName)
        myTextView.text = fruit.name
    }

}