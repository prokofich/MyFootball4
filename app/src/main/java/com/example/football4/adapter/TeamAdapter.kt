package com.example.football4.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.football4.R

import com.example.football4.model.item_team
import com.example.football4.model.item_teamItem
import com.example.football4.view.TeamFragment
import kotlinx.android.synthetic.main.item_country.view.*
import kotlinx.android.synthetic.main.item_team.view.*

class TeamAdapter(private val context: Context):RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    var List = emptyList<item_teamItem>()

    class TeamViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_team,parent,false)
        return TeamViewHolder(view)
    }

   // @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        //holder.itemView.id_item_team_name.setTextColor(R.color.blue_text)
        Glide.with(context)
            .load(List[position].team_badge)
            .into(holder.itemView.id_item_team_image)
        holder.itemView.id_item_team_name.text = List[position].team_name
    }

    override fun getItemCount(): Int {
        return List.size
    }

    /*override fun onViewAttachedToWindow(holder: TeamViewHolder) {
        super.onViewAttachedToWindow(holder)

        /*holder.itemView.setOnClickListener {
            TeamFragment.clickToTeam(List[holder.adapterPosition])
        }*/

    }*/

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:ArrayList<item_teamItem>){
        List = list
        notifyDataSetChanged()
    }

}