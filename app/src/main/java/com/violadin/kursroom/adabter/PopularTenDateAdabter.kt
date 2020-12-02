package com.violadin.kursroom.adabter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.violadin.kursroom.R


class PopularTenDateAdabter(private var topDates: List<Double>): RecyclerView.Adapter<PopularTenDateAdabter.ViewHolder>() {

    override fun getItemCount(): Int {
        return topDates.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularTenDateAdabter.ViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.recyclerview_row_date, parent, false)
        return PopularTenDateAdabter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}