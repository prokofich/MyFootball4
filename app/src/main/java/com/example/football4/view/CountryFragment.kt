package com.example.football4.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import com.bumptech.glide.Glide
import com.example.football4.MAIN
import com.example.football4.R
import kotlinx.android.synthetic.main.fragment_country.*

class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_country, container, false)
    }

    @SuppressLint("FragmentBackPressedCallback")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(requireContext())
            .load("http://37.27.9.28/4/emblemaengland.png")
            .into(id_country_england_image)

        Glide.with(requireContext())
            .load("http://37.27.9.28/4/emblemaspain.png")
            .into(id_country_spain_image)

        Glide.with(requireContext())
            .load("http://37.27.9.28/4/emblemafrance.png")
            .into(id_country_france_image)
        0
        Glide.with(requireContext())
            .load("http://37.27.9.28/4/emblemagermany.png")
            .into(id_country_germany_image)

        Glide.with(requireContext())
            .load("http://37.27.9.28/4/emblemaitaly.png")
            .into(id_country_italy_image)


        id_country_england_name.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("Country","England")
            MAIN.navController.navigate(R.id.action_countryFragment_to_leagueFragment,bundle)
        }

        id_country_spain_name.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("Country","Spain")
            MAIN.navController.navigate(R.id.action_countryFragment_to_leagueFragment,bundle)
        }

        id_country_france_name.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("Country","France")
            MAIN.navController.navigate(R.id.action_countryFragment_to_leagueFragment,bundle)
        }

        id_country_germany_name.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("Country","Germany")
            MAIN.navController.navigate(R.id.action_countryFragment_to_leagueFragment,bundle)
        }

        id_country_italy_name.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("Country","Italy")
            MAIN.navController.navigate(R.id.action_countryFragment_to_leagueFragment,bundle)
        }



        id_country_exit.setOnClickListener {
            MAIN.finishAffinity()
        }

        requireActivity().onBackPressedDispatcher.addCallback(this) {
            MAIN.finish()
        }



    }


}