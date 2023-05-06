package com.example.football4.api

import com.example.football4.model.item_team
import retrofit2.Response

class Repository {

    /*suspend fun getCountry(): Response<item_country> {
        return RetrofitInstance.api.getCountry()
    }

    suspend fun getLeague(country_id:String):Response<item_league>{
        return RetrofitInstance.api.getLeague(country_id)
    }*/

    suspend fun getTeams1():Response<item_team>{
        return RetrofitInstance.api.getTeams1()
    }

    suspend fun getTeams2():Response<item_team>{
        return RetrofitInstance.api.getTeams2()
    }
    suspend fun getTeams3():Response<item_team>{
        return RetrofitInstance.api.getTeams3()
    }
    suspend fun getTeams4():Response<item_team>{
        return RetrofitInstance.api.getTeams4()
    }
    suspend fun getTeams5():Response<item_team>{
        return RetrofitInstance.api.getTeams5()
    }
    suspend fun getTeams6():Response<item_team>{
        return RetrofitInstance.api.getTeams6()
    }
    suspend fun getTeams7():Response<item_team>{
        return RetrofitInstance.api.getTeams7()
    }
    suspend fun getTeams8():Response<item_team>{
        return RetrofitInstance.api.getTeams8()
    }
    suspend fun getTeams9():Response<item_team>{
        return RetrofitInstance.api.getTeams9()
    }
    suspend fun getTeams10():Response<item_team>{
        return RetrofitInstance.api.getTeams10()
    }
    suspend fun getTeams11():Response<item_team>{
        return RetrofitInstance.api.getTeams11()
    }
    suspend fun getTeams12():Response<item_team>{
        return RetrofitInstance.api.getTeams12()
    }
    suspend fun getTeams13():Response<item_team>{
        return RetrofitInstance.api.getTeams13()
    }
    suspend fun getTeams14():Response<item_team>{
        return RetrofitInstance.api.getTeams14()
    }
    suspend fun getTeams15():Response<item_team>{
        return RetrofitInstance.api.getTeams15()
    }
    suspend fun getTeams16():Response<item_team>{
        return RetrofitInstance.api.getTeams16()
    }
    suspend fun getTeams17():Response<item_team>{
        return RetrofitInstance.api.getTeams17()
    }
    suspend fun getTeams18():Response<item_team>{
        return RetrofitInstance.api.getTeams18()
    }
    suspend fun getTeams19():Response<item_team>{
        return RetrofitInstance.api.getTeams19()
    }
    suspend fun getTeams20():Response<item_team>{
        return RetrofitInstance.api.getTeams20()
    }


}