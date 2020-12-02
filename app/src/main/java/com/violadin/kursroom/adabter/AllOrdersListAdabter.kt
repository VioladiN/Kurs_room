package com.violadin.kursroom.adabter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.violadin.kursroom.R
import com.violadin.kursroom.model.AllOrders

class AllOrdersListAdabter(private var allOrders: List<AllOrders>): RecyclerView.Adapter<AllOrdersListAdabter.ViewHolder>(){

    override fun getItemCount(): Int {
        return allOrders.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = allOrders[position].client
        holder.fuel.text = allOrders[position].fuel
        holder.liters.text = allOrders[position].liters.toString()
        holder.date.text = allOrders[position].date.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.recyclerview_row_orders, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.allorders_client)
        val fuel = itemView.findViewById<TextView>(R.id.allorders_fuel)
        val liters = itemView.findViewById<TextView>(R.id.allorders_liters)
        val date = itemView.findViewById<TextView>(R.id.allorders_date)
    }
}