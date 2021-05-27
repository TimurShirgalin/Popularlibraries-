package com.example.popularlibraries

class CountersModel {

    private val counters = mutableListOf(0, 0, 0)

    fun next(index: Int): Int = ++counters[index]
}
