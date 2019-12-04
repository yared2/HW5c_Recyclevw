package com.example.hw5c_recycleview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView



class recycleadapter(var context:Context,var product:Array<Product>) : RecyclerView.Adapter<recycleadapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(v);
    }

    override fun getItemCount(): Int {
        return product.size
    }

    override fun onBindViewHolder(holder: recycleadapter.MyViewHolder, position: Int) {
        holder.im.setImageResource(product[position].image.toInt())
        holder.t1.text = product[position].Title
        holder.t2.text = product[position].color

        holder.parentlayout.setOnClickListener {
            val intent = Intent(context, detail::class.java)

            var res = product[position]
//            Toast.makeText(context, " $res clicked", Toast.LENGTH_LONG).show()
            intent.putExtra("image", product[position].image.toInt())
            intent.putExtra("name", product[position].color)
            intent.putExtra("detail", product[position].desc)
            context.startActivity(intent)
        }
        }
        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var t1: TextView = itemView.findViewById<TextView>(R.id.textView2)
            var t2: TextView = itemView.findViewById<TextView>(R.id.textView3)
            var im: ImageView = itemView.findViewById<ImageView>(R.id.imageView3)
            var parentlayout: RelativeLayout = itemView.findViewById(R.id.layout) as RelativeLayout
        }

    }
