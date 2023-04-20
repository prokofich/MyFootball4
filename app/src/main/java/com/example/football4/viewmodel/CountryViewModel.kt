package com.example.football4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.football4.api.Repository
import com.example.football4.model.item_country
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class CountryViewModel:ViewModel() {

    val repo = Repository()
    var Country:MutableLiveData<Response<item_country>> = MutableLiveData()

    fun getCountry(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = repo.getCountry()
            withContext(Dispatchers.Main){
                Country.value = response
            }

        }
    }

}