package com.example.project_2_recyclerview_app.adapter

import com.example.project_2_recyclerview_app.R

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.model.Athkari


class AthkariAdapter(private val dataset: List<Athkari>, private val context: Context) : RecyclerView.Adapter<AthkariAdapter.AthkarViewHolder>() {

    class AthkarViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AthkarViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_athkari, parent, false)
        return AthkarViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: AthkarViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.athkarStringId)
        holder.imageView.setImageResource(item.athkarImageId)
    }

    override fun getItemCount() = dataset.size
}