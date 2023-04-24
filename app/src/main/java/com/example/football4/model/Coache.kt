package com.example.football4.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Parcelize
@Keep
data class Coache(
    val coach_age: String,
    val coach_country: String,
    val coach_name: String
):Parcelable