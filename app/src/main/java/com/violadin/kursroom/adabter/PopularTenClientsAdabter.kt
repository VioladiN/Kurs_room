package com.violadin.kursroom.adabter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.violadin.kursroom.R

class PopularTenClientsAdabter(private var topClients: List<Double>): RecyclerView.Adapter<PopularTenClientsAdabter.ViewHolder>() {

    override fun getItemCount(): Int {
        return topClients.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.recyclerview_row_clients, parent, false)
        return PopularTenClientsAdabter.ViewHolder(view)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

}