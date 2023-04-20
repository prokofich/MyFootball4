package com.example.football4.view

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.football4.MAIN
import com.example.football4.R
import com.example.football4.adapter.CountryAdapter
import com.example.football4.adapter.LeagueAdapter
import com.example.football4.model.item_countryItem
import com.example.football4.model.item_leagueItem
import com.example.football4.viewmodel.CountryViewModel
import com.example.football4.viewmodel.LeagueViewModel
import kotlinx.android.synthetic.main.fragment_country.*
import kotlinx.android.synthetic.main.fragment_league.*

class LeagueFragment : Fragment() {

    lateinit var recyclerViewLeague: RecyclerView
    lateinit var adapterLeague: LeagueAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_league, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val leagueViewModel = ViewModelProvider(this)[LeagueViewModel::class.java]

        recyclerViewLeague = id_league_rv
        adapterLeague = LeagueAdapter(requireContext())
        recyclerViewLeague.adapter = adapterLeague

        var itemCountry: item_countryItem? = requireArguments().getParcelable("country")
        var idCountry = ""

        val nameCountry = itemCountry!!.country_name
        val imageCountry = itemCountry.country_logo
        idCountry = itemCountry.country_id

        Glide.with(requireContext())
            .load(imageCountry)
            .into(id_league_image)

        id_league_name_country.text = nameCountry


        leagueViewModel.getLeague(idCountry)
        leagueViewModel.League.observe(viewLifecycleOwner){ list ->
            list.body().let{adapterLeague.setList(it!!)}
        }




    }



    companion object{
        fun clickToLeague(leagueItem:item_leagueItem){
            val bundle = Bundle()
            bundle.putParcelable("league",leagueItem)
            MAIN.navController.navigate(R.id.action_leagueFragment_to_teamFragment,bundle)
        }
    }



}