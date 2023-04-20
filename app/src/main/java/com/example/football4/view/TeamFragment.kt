package com.example.football4.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.football4.MAIN
import com.example.football4.R
import com.example.football4.adapter.LeagueAdapter
import com.example.football4.adapter.TeamAdapter
import com.example.football4.model.item_countryItem
import com.example.football4.model.item_leagueItem
import com.example.football4.model.item_teamItem
import com.example.football4.viewmodel.TeamViewModel
import kotlinx.android.synthetic.main.fragment_league.*
import kotlinx.android.synthetic.main.fragment_team.*

class TeamFragment : Fragment() {

    lateinit var recyclerViewTeam: RecyclerView
    lateinit var adapterTeam: TeamAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var itemLeague: item_leagueItem? = requireArguments().getParcelable("league")
        var idLeague = ""

        if(itemLeague!=null){
            val nameLeague = itemLeague!!.league_name
            val imageLeague = itemLeague.league_logo
            val seasonsLeague = itemLeague.league_season
            idLeague = itemLeague.league_id

            Glide.with(requireContext())
                .load(imageLeague)
                .into(id_team_image)

            id_team_league_name.text = nameLeague
            id_team_seasons.text = seasonsLeague
        }


        val teamViewModel = ViewModelProvider(this)[TeamViewModel::class.java]

        recyclerViewTeam = id_team_rv
        adapterTeam = TeamAdapter(requireContext())
        recyclerViewTeam.adapter = adapterTeam

        if(idLeague!=""){
            teamViewModel.getTeam(idLeague)
        }
        teamViewModel.Team.observe(viewLifecycleOwner){ list->
            list.body().let{adapterTeam.setList(it!!)}
        }




    }

    companion object{
        fun clickToTeam(teamItem:item_teamItem){
            val bundle = Bundle()
            bundle.putParcelable("team",teamItem)
            MAIN.navController.navigate(R.id.action_teamFragment_to_playerFragment,bundle)
        }
    }


}