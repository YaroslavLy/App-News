package com.example.myappnews.ui

import CategoriesAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myappnews.R
import com.example.myappnews.data.CategoriesViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val recyclerview = findViewById<RecyclerView>(R.id.category)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<CategoriesViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(CategoriesViewModel("Item " + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CategoriesAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}