package com.example.football4.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class item_teamItem(
    val coaches: List<Coache>,
    val players: List<Player>,
    val team_badge: String,
    val team_key: String,
    val team_name: String
):Parcelable