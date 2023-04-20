package com.example.football4.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.football4.R
import com.example.football4.model.item_countryItem
import com.example.football4.view.CountryFragment
import com.example.football4.view.StartFragment
import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(private val context: Context):RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {


    var List = emptyList<item_countryItem>()


    class CountryViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
            if(List[position].country_logo!=""){
                Glide.with(context)
                    .load(List[position].country_logo)
                    .into(holder.itemView.id_item_country_image)
            }else{
                Glide.with(context)
                    .load(R.drawable.flag2)
                    .into(holder.itemView.id_item_country_image)
            }

            holder.itemView.id_item_country_name.text = List[position].country_name

    }

    override fun getItemCount(): Int {
        return List.size
    }

    override fun onViewAttachedToWindow(holder: CountryViewHolder) {
        super.onViewAttachedToWindow(holder)

        holder.itemView.setOnClickListener {
            CountryFragment.clickToCountry(List[holder.adapterPosition])
        }

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:ArrayList<item_countryItem>){
        list.removeAt(0)
        list.removeAt(0)
        List = list
        notifyDataSetChanged()
    }

}