package com.example.football4.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.football4.MAIN
import com.example.football4.R
import com.example.football4.adapter.LeagueAdapter
import com.example.football4.adapter.PlayerAdapter
import com.example.football4.model.item_countryItem
import com.example.football4.model.item_teamItem
import kotlinx.android.synthetic.main.fragment_league.*
import kotlinx.android.synthetic.main.fragment_player.*

class PlayerFragment : Fragment() {

    lateinit var recyclerViewPlayer: RecyclerView
    lateinit var adapterPlayer: PlayerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_player, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var itemTeam: item_teamItem = requireArguments().getParcelable("team")!!

        val nameTeam = itemTeam!!.team_name
        val imageTeam = itemTeam.team_badge
        val listPlayers = itemTeam.players

        Glide.with(requireContext())
            .load(imageTeam)
            .into(id_player_team_image)
        id_player_name_team.text = nameTeam

        recyclerViewPlayer = id_player_rv
        adapterPlayer = PlayerAdapter(requireContext())
        recyclerViewPlayer.adapter = adapterPlayer

        adapterPlayer.setList(listPlayers)




    }

}