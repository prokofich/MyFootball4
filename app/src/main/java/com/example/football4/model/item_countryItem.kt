package com.example.football4.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Parcelize
@Keep
data class item_countryItem(
    val country_id: String,
    val country_logo: String,
    val country_name: String
):Parcelable