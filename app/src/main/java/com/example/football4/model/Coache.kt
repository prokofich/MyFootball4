package com.example.football4.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Coache(
    val coach_age: String,
    val coach_country: String,
    val coach_name: String
):Parcelable