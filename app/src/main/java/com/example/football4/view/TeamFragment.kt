package com.example.football4.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.football4.R
import com.example.football4.adapter.TeamAdapter
import com.example.football4.viewmodel.TeamViewModel
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

        var League = requireArguments().getString("League")

        val teamViewModel = ViewModelProvider(this)[TeamViewModel::class.java]

        recyclerViewTeam = id_team_rv
        adapterTeam = TeamAdapter(requireContext())
        recyclerViewTeam.adapter = adapterTeam


        teamViewModel.getTeams(League.toString())
        teamViewModel.Team.observe(viewLifecycleOwner){ list->
            list.body().let{adapterTeam.setList(it!!)}
        }

    }


}