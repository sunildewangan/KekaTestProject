package com.test.sampleapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.test.sampleapp.R
import com.test.sampleapp.data.model.Results

class MainAdapter(private val users: ArrayList<Results>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(result: Results) {
            itemView.apply {
                itemView.findViewById<TextView>(R.id.textViewUserName).text = result.title
                itemView.findViewById<TextView>(R.id.textViewUserEmail).text = result.abstract
                itemView.findViewById<TextView>(R.id.textViewUserName).text = result.title
                Glide.with(itemView.context)
                    .load(result.multimedia[0].url)
                    .into(itemView.findViewById<ImageView>(R.id.imageViewAvatar))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int  = users.size

    fun addUsers(users: List<Results>) {
        this.users.apply {
            clear()
            addAll(users)
        }

    }
}