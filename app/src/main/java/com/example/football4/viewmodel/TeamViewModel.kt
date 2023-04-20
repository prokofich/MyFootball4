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

    fun getTeam(league_id:String){
        viewModelScope.launch(Dispatchers.IO) {
            val responce = repo.getTeam(league_id)
            withContext(Dispatchers.Main){
                Team.value = responce
            }
        }
    }


}