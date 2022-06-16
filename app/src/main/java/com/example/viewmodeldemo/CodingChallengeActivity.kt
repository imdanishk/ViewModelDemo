package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo.databinding.ActivityCodingChallengeBinding

class CodingChallengeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCodingChallengeBinding
    private lateinit var viewModel: CodingChallengeViewModel
    private lateinit var viewModelFactory: CodingChallengeViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coding_challenge)

        viewModelFactory = CodingChallengeViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(CodingChallengeViewModel::class.java)

        viewModel.totalData.observe(this, Observer {
            binding.tvResult.text = it.toString()
        })



        binding.btnAdd.setOnClickListener {
            viewModel.setTotal(binding.etInput.text.toString().toInt())
        }

    }
}