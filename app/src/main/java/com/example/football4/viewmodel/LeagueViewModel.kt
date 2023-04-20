package com.example.football4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.football4.api.Repository
import com.example.football4.model.item_league
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class LeagueViewModel:ViewModel() {

    val repo = Repository()
    var League:MutableLiveData<Response<item_league>> = MutableLiveData()

    fun getLeague(country_id:String){
        viewModelScope.launch(Dispatchers.IO) {
            val response = repo.getLeague(country_id)
            withContext(Dispatchers.Main){
                League.value = response
            }
        }
    }

}