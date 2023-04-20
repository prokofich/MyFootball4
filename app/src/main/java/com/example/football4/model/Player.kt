package com.example.football4.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Player(
    val player_key: String,
    val player_id : String,
    val player_image: String,
    val player_name: String,
    val player_number: String,
    val player_country: String,
    val player_type: String,
    val player_age: String,
    val player_match_played: String,
    val player_goals: String,
    val player_yellow_cards: String,
    val player_red_cards: String,
    val player_injured: String,
    val player_substitute_out: String,
    val player_substitutes_on_bench: String,
    val player_assists: String,
    val player_is_captain: String,
    val player_shots_total: String,
    val player_goals_conceded: String,
    val player_fouls_committed: String,
    val player_tackles: String,
    val player_blocks: String,
    val player_crosses_total: String,
    val player_interceptions: String,
    val player_clearances: String,
    val player_dispossesed: String,
    val player_saves: String,
    val player_inside_box_saves: String,
    val player_duels_total: String,
    val player_duels_won: String,
    val player_dribble_attempts: String,
    val player_dribble_succ: String,
    val player_pen_comm: String,
    val player_pen_won: String,
    val player_pen_scored: String,
    val player_pen_missed: String,
    val player_passes: String,
    val player_passes_accuracy: String,
    val player_key_passes: String,
    val player_woordworks:String,
    val player_rating: String
):Parcelable