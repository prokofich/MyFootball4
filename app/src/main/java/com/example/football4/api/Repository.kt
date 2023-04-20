package com.example.football4.api

import com.example.football4.model.item_country
import com.example.football4.model.item_league
import com.example.football4.model.item_team
import retrofit2.Response

class Repository {

    suspend fun getCountry(): Response<item_country> {
        return RetrofitInstance.api.getCountry()
    }

    suspend fun getLeague(country_id:String):Response<item_league>{
        return RetrofitInstance.api.getLeague(country_id)
    }

    suspend fun getTeam(league_id:String):Response<item_team>{
        return RetrofitInstance.api.getTeam(league_id)
    }

}