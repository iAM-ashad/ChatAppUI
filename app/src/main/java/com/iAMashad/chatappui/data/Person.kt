package com.iAMashad.chatappui.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.iAMashad.chatappui.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val id: Int = 0,
    val name: String = "",
    @DrawableRes val icon: Int = R.drawable.person_1
) : Parcelable

val personList = listOf(
    Person(
        1,
        "Debashish",
        R.drawable.person_1
    ),
    Person(
        2,
        "Papa",
        R.drawable.person_2
    ),
    Person(
        3,
        "Ayush",
        R.drawable.person_3
    ),
    Person(
        4,
        "Sohan",
        R.drawable.person_4
    ),
    Person(
        5,
        "Mummy",
        R.drawable.person_5
    ),
    Person(
        6,
        "Sohan",
        R.drawable.person_1
    ),
    Person(
        7,
        "Ishan",
        R.drawable.person_2
    ),
    Person(
        8,
        "Samay",
        R.drawable.person_3
    ),
    Person(
        9,
        "Rishi",
        R.drawable.person_4
    ),
    Person(
        10,
        "Sanya",
        R.drawable.person_5
    ),
)