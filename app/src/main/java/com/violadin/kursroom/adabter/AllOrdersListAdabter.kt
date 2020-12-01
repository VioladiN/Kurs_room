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
        holder.nameClient.text = allOrders[position].name.toString()
        holder.nameFuel.text = allOrders[position].fuel.toString()
        holder.litrCount.text = allOrders[position].litr.toString()
        holder.date.text = allOrders[position].date.toString()
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val nameClient = itemView.findViewById<TextView>(R.id.tv_client)
        val nameFuel = itemView.findViewById<TextView>(R.id.tv_fuel)
        val litrCount = itemView.findViewById<TextView>(R.id.tv_litr_fuel)
        val date = itemView.findViewById<TextView>(R.id.tv_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.recyclerview_row_orders, parent, false)
        return ViewHolder(view)
    }
}