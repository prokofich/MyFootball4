package com.example.football4.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.addCallback
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.football4.MAIN
import com.example.football4.R
import com.example.football4.adapter.CountryAdapter
import com.example.football4.model.item_countryItem
import com.example.football4.viewmodel.CountryViewModel
import kotlinx.android.synthetic.main.fragment_country.*

class CountryFragment : Fragment() {

    lateinit var recyclerViewCountry: RecyclerView
    lateinit var adapterCountry: CountryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_country, container, false)
    }

    @SuppressLint("FragmentBackPressedCallback")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val countryViewModel = ViewModelProvider(this)[CountryViewModel::class.java]

        recyclerViewCountry = id_country_rv
        adapterCountry = CountryAdapter(requireContext())
        recyclerViewCountry.adapter = adapterCountry

        countryViewModel.getCountry()
        countryViewModel.Country.observe(viewLifecycleOwner){ list->
            list.body().let{adapterCountry.setList(it!!)}
            //Toast.makeText(requireContext(),"${list.body()!![0].country_id}",Toast.LENGTH_SHORT).show()
        }

        id_country_exit.setOnClickListener {
            //MAIN.finish()
            MAIN.finishAffinity()
        }

        requireActivity().onBackPressedDispatcher.addCallback(this) {
            MAIN.finish()
        }



    }



    companion object{
        fun clickToCountry(countryItem:item_countryItem){
            val bundle = Bundle()
            bundle.putParcelable("country",countryItem)
            MAIN.navController.navigate(R.id.action_countryFragment_to_leagueFragment,bundle)
        }
    }

}