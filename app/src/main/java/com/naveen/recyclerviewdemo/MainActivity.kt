package com.naveen.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitsList = listOf<Fruit>(
       Fruit ("Mango", "Joe"),
        Fruit("Apple","John Doe"),
        Fruit("Banana","Joe Snow"),
        Fruit("Guava","Nibba One"),
        Fruit("Lemon","Nibba Two"),
        Fruit("Pear","Nibba Three"),
        Fruit("Orange", "Nibba Four")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdaptor(fruitsList)
    }
}