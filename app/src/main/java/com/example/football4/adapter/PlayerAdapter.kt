package com.example.football4.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.football4.R
import com.example.football4.model.Player
import kotlinx.android.synthetic.main.item_player_in_team.view.*

class PlayerAdapter(private val context: Context):RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    var List = emptyList<Player>()

    class PlayerViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_player_in_team,parent,false)
        return PlayerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        if(List[position].player_image!=""){
            Glide.with(context)
                .load(List[position].player_image)
                .into(holder.itemView.id_item_player_in_team_image)
        }else{
            Glide.with(context)
                .load(R.drawable.avatarka)
                .into(holder.itemView.id_item_player_in_team_image)
        }
        if(List[position].player_number!=""){
            holder.itemView.id_item_player_in_team_number.text = List[position].player_number
        }else{
            holder.itemView.id_item_player_in_team_number.text = "-"
        }

        holder.itemView.id_item_player_in_team_name.text = List[position].player_name
        holder.itemView.id_item_player_in_team_position.text = List[position].player_type


    }

    override fun getItemCount(): Int {
        return List.size
    }


    @JvmName("setList1")
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:List<Player>){
        List = list
        notifyDataSetChanged()
    }

}