package com.example.football4.view

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.bumptech.glide.Glide
import com.example.football4.MAIN
import com.example.football4.R
import kotlinx.android.synthetic.main.fragment_league.*

class LeagueFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_league, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var country = requireArguments().getString("Country")

        when(country){
            "England" -> {
                id_league_name_country.text = country
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/emblemaengland.png")
                    .into(id_league_image)

                id_league_name_1.text = "Championship"
                id_league_seasons_1.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/englandchampionship.png")
                    .into(id_league_image_1)

                id_league_name_2.text = "FA Cup"
                id_league_seasons_2.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/englandfacup.png")
                    .into(id_league_image_2)

                id_league_name_3.text = "Premier League"
                id_league_seasons_3.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/englandpremierleague.png")
                    .into(id_league_image_3)

                id_league_name_4.text = "League One"
                id_league_seasons_4.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/englandleagueone.png")
                    .into(id_league_image_4)
            }
            "Spain" -> {
                id_league_name_country.text = country
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/emblemaspain.png")
                    .into(id_league_image)

                id_league_name_1.text = "Copa del Rey"
                id_league_seasons_1.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/spaincopadelrey.png")
                    .into(id_league_image_1)

                id_league_name_2.text = "La Liga"
                id_league_seasons_2.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/spainlaliga.png")
                    .into(id_league_image_2)

                id_league_name_3.text = "Segunda Division"
                id_league_seasons_3.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/spainsegundadivision.png")
                    .into(id_league_image_3)

                id_league_name_4.text = "Super Cup"
                id_league_seasons_4.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/spainsupercup.png")
                    .into(id_league_image_4)
            }
            "France" -> {
                id_league_name_country.text = country
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/emblemafrance.png")
                    .into(id_league_image)

                id_league_name_1.text = "Coupe de France"
                id_league_seasons_1.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/francecoupedefrance.png")
                    .into(id_league_image_1)

                id_league_name_2.text = "Ligue 1"
                id_league_seasons_2.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/franceligue1.png")
                    .into(id_league_image_2)

                id_league_name_3.text = "Ligue 2"
                id_league_seasons_3.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/franceligue2.png")
                    .into(id_league_image_3)

                id_league_name_4.text = "Coupe de la Ligue"
                id_league_seasons_4.text = "2019/2020"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/francecoupedelaligue.png")
                    .into(id_league_image_4)
            }
            "Germany" -> {
                id_league_name_country.text = country
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/emblemagermany.png")
                    .into(id_league_image)

                id_league_name_1.text = "2. Bundesliga"
                id_league_seasons_1.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/germany2bundesliga.png")
                    .into(id_league_image_1)

                id_league_name_2.text = "Bundesliga"
                id_league_seasons_2.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/germanybundesliga.png")
                    .into(id_league_image_2)

                id_league_name_3.text = "DFB Pokal"
                id_league_seasons_3.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/germanydfbpokal.png")
                    .into(id_league_image_3)

                id_league_name_4.text = "3. Liga"
                id_league_seasons_4.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/germany3liga.png")
                    .into(id_league_image_4)
            }
            "Italy" -> {
                id_league_name_country.text = country
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/emblemaitaly.png")
                    .into(id_league_image)

                id_league_name_1.text = "Coppa Italia"
                id_league_seasons_1.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/italycoppaitalia.png")
                    .into(id_league_image_1)

                id_league_name_2.text = "Serie A"
                id_league_seasons_2.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/italyseriea.png")
                    .into(id_league_image_2)

                id_league_name_3.text = "Serie B"
                id_league_seasons_3.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/italyserieb.png")
                    .into(id_league_image_3)

                id_league_name_4.text = "Campionato Primavera 1"
                id_league_seasons_4.text = "2022/2023"
                Glide.with(requireContext())
                    .load("http://37.27.9.28/4/emblemaitaly.png")
                    .into(id_league_image_4)
            }
        }


        id_league_name_1.setOnClickListener {
            var bundle = Bundle()
            if(country=="England"){
                bundle.putString("League","Championship")
            }
            if(country=="Spain"){
                bundle.putString("League","Copa del Rey")
            }
            if(country=="France"){
                bundle.putString("League","Coupe de France")
            }
            if(country=="Germany"){
                bundle.putString("League","2. Bundesliga")
            }
            if(country=="Italy"){
                bundle.putString("League","Coppa Italia")
            }
            MAIN.navController.navigate(R.id.action_leagueFragment_to_teamFragment,bundle)
        }

        id_league_name_2.setOnClickListener {
            var bundle = Bundle()
            if(country=="England"){
                bundle.putString("League","FA Cup")
            }
            if(country=="Spain"){
                bundle.putString("League","La Liga")
            }
            if(country=="France"){
                bundle.putString("League","Ligue 1")
            }
            if(country=="Germany"){
                bundle.putString("League","Bundesliga")
            }
            if(country=="Italy"){
                bundle.putString("League","Serie A")
            }
            MAIN.navController.navigate(R.id.action_leagueFragment_to_teamFragment,bundle)
        }

        id_league_name_3.setOnClickListener {
            var bundle = Bundle()
            if(country=="England"){
                bundle.putString("League","Premier League")
            }
            if(country=="Spain"){
                bundle.putString("League","Segunda Division")
            }
            if(country=="France"){
                bundle.putString("League","Ligue 2")
            }
            if(country=="Germany"){
                bundle.putString("League","DFB Pokal")
            }
            if(country=="Italy"){
                bundle.putString("League","Serie B")
            }
            MAIN.navController.navigate(R.id.action_leagueFragment_to_teamFragment,bundle)
        }

        id_league_name_4.setOnClickListener {
            var bundle = Bundle()
            if(country=="England"){
                bundle.putString("League","League One")
            }
            if(country=="Spain"){
                bundle.putString("League","Super Cup")
            }
            if(country=="France"){
                bundle.putString("League","Coupe de la Ligue")
            }
            if(country=="Germany"){
                bundle.putString("League","3. Liga")
            }
            if(country=="Italy"){
                bundle.putString("League","Campionato Primavera 1")
            }
            MAIN.navController.navigate(R.id.action_leagueFragment_to_teamFragment,bundle)
        }



    }






}