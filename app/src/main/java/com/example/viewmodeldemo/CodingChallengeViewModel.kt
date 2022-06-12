package com.example.viewmodeldemo

import androidx.lifecycle.ViewModel

class CodingChallengeViewModel : ViewModel() {
    private var total = 0

    fun getTotal() : Int {
        return total
    }
    fun setTotal(input : Int) {
        total += input
    }
}