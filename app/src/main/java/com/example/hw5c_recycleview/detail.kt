package com.example.hw5c_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var ig =intent.getIntExtra("image",0)
        var t1 = intent.getStringExtra("name")
        var t2 = intent.getStringExtra("detail")
        desc.text = t2.toString()
        title1.text = t1.toString()

        imageView.setImageResource(ig)
    }
}
