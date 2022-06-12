package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo.databinding.ActivityCodingChallengeBinding

class CodingChallengeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCodingChallengeBinding
    private lateinit var viewModel: CodingChallengeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coding_challenge)

        viewModel = ViewModelProvider(this).get(CodingChallengeViewModel::class.java)
        binding.tvResult.text = viewModel.getTotal().toString()

        binding.btnAdd.setOnClickListener {
            viewModel.setTotal(binding.etInput.text.toString().toInt())
            binding.tvResult.text = viewModel.getTotal().toString()
        }

    }
}