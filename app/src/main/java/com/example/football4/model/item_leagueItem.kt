package com.example.football4.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class item_leagueItem(
    val country_id: String,
    val country_logo: String,
    val country_name: String,
    val league_id: String,
    val league_logo: String,
    val league_name: String,
    val league_season: String
):Parcelable