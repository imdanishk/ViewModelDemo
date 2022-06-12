package com.example.viewmodeldemo

import androidx.lifecycle.ViewModel

class CodingChallengeViewModel(startingTotal: Int) : ViewModel() {
    private var total = 0

    // Init block to assign the passed startingTotal value to the total variable
    init {
        total = startingTotal
    }

    fun getTotal() : Int {
        return total
    }
    fun setTotal(input : Int) {
        total += input
    }
}