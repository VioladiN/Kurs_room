package com.violadin.kursroom.adabter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.violadin.kursroom.R
import com.violadin.kursroom.model.TopClients

class PopularTenClientsAdabter(private var topClients: List<TopClients>): RecyclerView.Adapter<PopularTenClientsAdabter.ViewHolder>() {

    override fun getItemCount(): Int {
        return topClients.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = topClients[position].client
        holder.money.text = topClients[position].total.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.recyclerview_row_clients, parent, false)
        return PopularTenClientsAdabter.ViewHolder(view)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.topclients_client)
        val money = itemView.findViewById<TextView>(R.id.topclients_spentmoney)
    }

}