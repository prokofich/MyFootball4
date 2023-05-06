package com.example.football4.api

import com.example.football4.model.item_team
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    /*@GET("?action=get_countries&APIkey=4149ce2a8a6bb2468e4e0524ee90f6e290303aef3484ba96cb003631427e4206")
    suspend fun getCountry():Response<item_country>

    @GET("?action=get_leagues&country_id=7&APIkey=4149ce2a8a6bb2468e4e0524ee90f6e290303aef3484ba96cb003631427e4206")
    suspend fun getLeague(@Query("country_id") country_id:String):Response<item_league>

    @GET("?action=get_teams&league_id=20&APIkey=4149ce2a8a6bb2468e4e0524ee90f6e290303aef3484ba96cb003631427e4206")
    suspend fun getTeam(@Query("league_id") league_id:String):Response<item_team>*/

    @GET("4/championship.json")
    suspend fun getTeams1():Response<item_team>

    @GET("4/FACup.json")
    suspend fun getTeams2():Response<item_team>

    @GET("4/PremierLeague.json")
    suspend fun getTeams3():Response<item_team>

    @GET("4/LeagueOne.json")
    suspend fun getTeams4():Response<item_team>



    @GET("4/CopadelRey.json")
    suspend fun getTeams5():Response<item_team>

    @GET("4/LaLiga.json")
    suspend fun getTeams6():Response<item_team>

    @GET("4/SegundaDivision.json")
    suspend fun getTeams7():Response<item_team>

    @GET("4/SuperCup.json")
    suspend fun getTeams8():Response<item_team>



    @GET("4/CoupedeFrance.json")
    suspend fun getTeams9():Response<item_team>

    @GET("4/Ligue1.json")
    suspend fun getTeams10():Response<item_team>

    @GET("4/Ligue2.json")
    suspend fun getTeams11():Response<item_team>

    @GET("4/CoupedelaLigue.json")
    suspend fun getTeams12():Response<item_team>




    @GET("4/2Bundesliga.json")
    suspend fun getTeams13():Response<item_team>

    @GET("4/Bundesliga.json")
    suspend fun getTeams14():Response<item_team>

    @GET("4/DFBPokal.json")
    suspend fun getTeams15():Response<item_team>

    @GET("4/3Liga.json")
    suspend fun getTeams16():Response<item_team>




    @GET("4/CoppaItalia.json")
    suspend fun getTeams17():Response<item_team>

    @GET("4/SerieA.json")
    suspend fun getTeams18():Response<item_team>

    @GET("4/SerieB.json")
    suspend fun getTeams19():Response<item_team>

    @GET("4/CampionatoPrimavera1.json")
    suspend fun getTeams20():Response<item_team>



}