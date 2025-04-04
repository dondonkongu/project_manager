package com.example.projectmanager.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectmanager.Domain.TeamDomain
import com.example.projectmanager.R

class MyTeamAdapter(private val items: List<TeamDomain>):
    RecyclerView.Adapter<MyTeamAdapter.ViewHolder>(){

    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.titleTxt)
        val status: TextView = itemView.findViewById(R.id.statusTxt)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_team,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item= items[position]
        holder.title.text = item.title
        holder.status.text = item.status
    }
}