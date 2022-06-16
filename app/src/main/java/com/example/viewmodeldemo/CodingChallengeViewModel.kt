package com.example.viewmodeldemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CodingChallengeViewModel(startingTotal: Int) : ViewModel() {
    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
    /*
    This total is a mutable livedata object but mutable livedata object
    is a subclass of livedata. So, this total can also be considered as
    a livedata object.
     */
    get() = total

    // Init block to assign the passed startingTotal value to the total variable
    init {
        total.value = startingTotal
    }

    fun setTotal(input : Int) {
        total.value = (total.value)?.plus(input)
    }
}