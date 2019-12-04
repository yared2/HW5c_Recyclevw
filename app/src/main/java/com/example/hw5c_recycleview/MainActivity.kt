package com.example.hw5c_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var products = arrayOf(Product("dell",343.3,"black",R.drawable.labtop.toString(),"023","4 gb ram     CPU: Go for Core i5. ...\n" +
            "    RAM: Roll with 8GB. ...\n" +
            "    Storage: 256GB SSD or better. ...\n" +
            "    Screen: At Least 1920 x 1080 resolution. ...\n" ),
        Product("lenovo",343.3,"black",R.drawable.tablet.toString(),"023","smoth screen Samsung Galaxy Tab S 10.5 tablet was launched in June 2014. The tablet comes with a 10.50-inch display with a resolution of 2560x1600 pixels at a pixel density of 288 pixels per inch (ppi). "),
        Product("sony",343.3,"white",R.drawable.tv.toString(),"023","big screen"),
        Product("flash",343.3,"black",R.drawable.flash6.toString(),"023","huge memore capacity Flash memory is a non-volatile memory chip used for storage and for transfering data between a personal computer (PC) and digital devices"),
        Product("printer",343.3,"black",R.drawable.printr5.toString(),"023","clear printing"))



    var r1: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var madr : recycleadapter?=null
    var imageges = intArrayOf(
        R.drawable.labtop,
        R.drawable.tablet,
        R.drawable.tv,
        R.drawable.flash6,
        R.drawable.printr5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        r1 = findViewById<RecyclerView>(R.id.rv)

        madr = recycleadapter(this,products)
        layoutManager = LinearLayoutManager(this)
        r1?.layoutManager = layoutManager
        r1?.adapter = madr
    }
}
