package com.example.football4.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.football4.R
import com.example.football4.model.item_league
import com.example.football4.model.item_leagueItem
import com.example.football4.view.LeagueFragment
import kotlinx.android.synthetic.main.item_league.view.*

class LeagueAdapter(private val context: Context):RecyclerView.Adapter<LeagueAdapter.LeagueViewHolder>() {

    var List = emptyList<item_leagueItem>()

    class LeagueViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_league,parent,false)
        return LeagueViewHolder(view)
    }

    override fun onBindViewHolder(holder: LeagueViewHolder, position: Int) {
        if(List[position].league_logo!=""){
        Glide.with(context)
            .load(List[position].league_logo)
            .into(holder.itemView.id_item_league_image)
    }else{
            Glide.with(context)
                .load(R.drawable.flag2)
                .into(holder.itemView.id_item_league_image)
        }
        holder.itemView.id_item_league_name.text = List[position].league_name
        holder.itemView.id_item_league_seasons.text = List[position].league_season
    }

    override fun getItemCount(): Int {
        return List.size
    }

    override fun onViewAttachedToWindow(holder: LeagueViewHolder) {
        super.onViewAttachedToWindow(holder)

        holder.itemView.setOnClickListener {
            LeagueFragment.clickToLeague(List[holder.adapterPosition])
        }

    }


    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:ArrayList<item_leagueItem>){
        List = list
        notifyDataSetChanged()
    }

}