package com.example.football4.api

import com.example.football4.model.item_country
import com.example.football4.model.item_league
import com.example.football4.model.item_team
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("?action=get_countries&APIkey=4149ce2a8a6bb2468e4e0524ee90f6e290303aef3484ba96cb003631427e4206")
    suspend fun getCountry():Response<item_country>

    @GET("?action=get_leagues&country_id=7&APIkey=4149ce2a8a6bb2468e4e0524ee90f6e290303aef3484ba96cb003631427e4206")
    suspend fun getLeague(@Query("country_id") country_id:String):Response<item_league>

    @GET("?action=get_teams&league_id=20&APIkey=4149ce2a8a6bb2468e4e0524ee90f6e290303aef3484ba96cb003631427e4206")
    suspend fun getTeam(@Query("league_id") league_id:String):Response<item_team>

}