package com.violadin.kursroom.adabter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.violadin.kursroom.R
import com.violadin.kursroom.model.TopDates


class PopularTenDateAdabter(private var topDates: List<TopDates>): RecyclerView.Adapter<PopularTenDateAdabter.ViewHolder>() {

    override fun getItemCount(): Int {
        return topDates.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularTenDateAdabter.ViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.recyclerview_row_date, parent, false)
        return PopularTenDateAdabter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.date.text = topDates[position].dat_order.toString()
        holder.money.text = topDates[position].total.toString()
        holder.clientsCount.text = topDates[position].count_clients.toString()
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val date = itemView.findViewById<TextView>(R.id.topdates_date)
        val money = itemView.findViewById<TextView>(R.id.topdates_money)
        val clientsCount = itemView.findViewById<TextView>(R.id.topdates_clients)
    }
}