package com.example.football4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.football4.api.Repository
import com.example.football4.model.item_team
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class TeamViewModel:ViewModel() {

    val repo = Repository()
    var Team:MutableLiveData<Response<item_team>> = MutableLiveData()

    fun getTeams(league:String){
        viewModelScope.launch(Dispatchers.IO) {
            if(league=="Championship"){
                val responce = repo.getTeams1()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="FA Cup"){
                val responce = repo.getTeams2()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Premier League"){
                val responce = repo.getTeams3()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="League One"){
                val responce = repo.getTeams4()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }


            if(league=="Copa del Rey"){
                val responce = repo.getTeams5()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="La Liga"){
                val responce = repo.getTeams6()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Segunda Division"){
                val responce = repo.getTeams7()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Super Cup"){
                val responce = repo.getTeams8()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }


            if(league=="Coupe de France"){
                val responce = repo.getTeams9()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Ligue 1"){
                val responce = repo.getTeams10()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Ligue 2"){
                val responce = repo.getTeams11()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Coupe de la Ligue"){
                val responce = repo.getTeams12()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }


            if(league=="2. Bundesliga"){
                val responce = repo.getTeams13()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Bundesliga"){
                val responce = repo.getTeams14()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="DFB Pokal"){
                val responce = repo.getTeams15()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="3. Liga"){
                val responce = repo.getTeams16()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }


            if(league=="Coppa Italia"){
                val responce = repo.getTeams17()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Serie A"){
                val responce = repo.getTeams18()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Serie B"){
                val responce = repo.getTeams19()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }
            if(league=="Campionato Primavera 1"){
                val responce = repo.getTeams20()
                withContext(Dispatchers.Main){
                    Team.value = responce
                }
            }

        }
    }


}