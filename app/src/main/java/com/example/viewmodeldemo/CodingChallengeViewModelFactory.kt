package com.example.viewmodeldemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

// We use a ViewModelFactory when we need to use custom ViewModels with constructor parameters.

class CodingChallengeViewModelFactory(private val startingTotal: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CodingChallengeViewModel::class.java)){
            return CodingChallengeViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}