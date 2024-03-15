package com.example.sodv3203_30daysapp_irenechan.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.sodv3203_30daysapp_irenechan.R

data class FitnessTip(
    @StringRes val dayRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)

object FitnessTipRepository {
    val fitnessTips = listOf(
        FitnessTip(
            dayRes = R.string.day1,
            titleRes = R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.fitness_1
        ),
        FitnessTip(
            dayRes = R.string.day2,
            titleRes = R.string.title2,
            descriptionRes = R.string.description2,
            imageRes = R.drawable.fitness_2
        ),
        FitnessTip(
            dayRes = R.string.day3,
            titleRes = R.string.title3,
            descriptionRes = R.string.description3,
            imageRes = R.drawable.fitness_3
        ),
        FitnessTip(
            dayRes = R.string.day4,
            titleRes = R.string.title4,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.fitness_4
        ),
        FitnessTip(
            dayRes = R.string.day5,
            titleRes = R.string.title5,
            descriptionRes = R.string.description5,
            imageRes = R.drawable.fitness_5
        ),
        FitnessTip(
            dayRes = R.string.day6,
            titleRes = R.string.title6,
            descriptionRes = R.string.description6,
            imageRes = R.drawable.fitness_6
        ),
        FitnessTip(
            dayRes = R.string.day7,
            titleRes = R.string.title7,
            descriptionRes = R.string.description7,
            imageRes = R.drawable.fitness_7
        ),
        FitnessTip(
            dayRes = R.string.day8,
            titleRes = R.string.title8,
            descriptionRes = R.string.description8,
            imageRes = R.drawable.fitness_8
        ),
        FitnessTip(
            dayRes = R.string.day9,
            titleRes = R.string.title9,
            descriptionRes = R.string.description9,
            imageRes = R.drawable.fitness_9
        ),
        FitnessTip(
            dayRes = R.string.day10,
            titleRes = R.string.title10,
            descriptionRes = R.string.description10,
            imageRes = R.drawable.fitness_10
        ),/*
        FitnessTip(
            dayRes = R.string.day11,
            titleRes = R.string.title11,
            descriptionRes = R.string.description11,
            imageRes = R.drawable.fitness_11
        ),*/
        FitnessTip(
            dayRes = R.string.day12,
            titleRes = R.string.title12,
            descriptionRes = R.string.description12,
            imageRes = R.drawable.fitness_12
        ),
        FitnessTip(
            dayRes = R.string.day13,
            titleRes = R.string.title13,
            descriptionRes = R.string.description13,
            imageRes = R.drawable.fitness_13
        ),
        FitnessTip(
            dayRes = R.string.day14,
            titleRes = R.string.title14,
            descriptionRes = R.string.description14,
            imageRes = R.drawable.fitness_14
        ),
        FitnessTip(
            dayRes = R.string.day15,
            titleRes = R.string.title15,
            descriptionRes = R.string.description15,
            imageRes = R.drawable.fitness_15
        ),
        FitnessTip(
            dayRes = R.string.day16,
            titleRes = R.string.title16,
            descriptionRes = R.string.description16,
            imageRes = R.drawable.fitness_16
        ),
        FitnessTip(
            dayRes = R.string.day17,
            titleRes = R.string.title17,
            descriptionRes = R.string.description17,
            imageRes = R.drawable.fitness_17
        ),
        FitnessTip(
            dayRes = R.string.day18,
            titleRes = R.string.title18,
            descriptionRes = R.string.description18,
            imageRes = R.drawable.fitness_18
        ),
        FitnessTip(
            dayRes = R.string.day19,
            titleRes = R.string.title19,
            descriptionRes = R.string.description19,
            imageRes = R.drawable.fitness_19
        ),
        FitnessTip(
            dayRes = R.string.day20,
            titleRes = R.string.title20,
            descriptionRes = R.string.description20,
            imageRes = R.drawable.fitness_20
        ),
        FitnessTip(
            dayRes = R.string.day21,
            titleRes = R.string.title21,
            descriptionRes = R.string.description21,
            imageRes = R.drawable.fitness_21
        ),
        FitnessTip(
            dayRes = R.string.day22,
            titleRes = R.string.title22,
            descriptionRes = R.string.description22,
            imageRes = R.drawable.fitness_22
        ),
        FitnessTip(
            dayRes = R.string.day23,
            titleRes = R.string.title23,
            descriptionRes = R.string.description23,
            imageRes = R.drawable.fitness_23
        ),
        FitnessTip(
            dayRes = R.string.day24,
            titleRes = R.string.title24,
            descriptionRes = R.string.description24,
            imageRes = R.drawable.fitness_24
        ),
        FitnessTip(
            dayRes = R.string.day25,
            titleRes = R.string.title25,
            descriptionRes = R.string.description25,
            imageRes = R.drawable.fitness_25
        ),
        FitnessTip(
            dayRes = R.string.day26,
            titleRes = R.string.title26,
            descriptionRes = R.string.description26,
            imageRes = R.drawable.fitness_26
        ),
        FitnessTip(
            dayRes = R.string.day27,
            titleRes = R.string.title27,
            descriptionRes = R.string.description27,
            imageRes = R.drawable.fitness_27
        ),
        FitnessTip(
            dayRes = R.string.day28,
            titleRes = R.string.title28,
            descriptionRes = R.string.description28,
            imageRes = R.drawable.fitness_28
        ),
        FitnessTip(
            dayRes = R.string.day29,
            titleRes = R.string.title29,
            descriptionRes = R.string.description29,
            imageRes = R.drawable.fitness_29
        ),
        FitnessTip(
            dayRes = R.string.day30,
            titleRes = R.string.title30,
            descriptionRes = R.string.description30,
            imageRes = R.drawable.fitness_30
        )
    )
}