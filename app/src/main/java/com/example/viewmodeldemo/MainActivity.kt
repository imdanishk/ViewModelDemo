package com.example.viewmodeldemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewModel.count.observe(this, Observer {
            binding.tvCount.text = it.toString()
        })

        binding.btnClick.setOnClickListener {
            viewModel.updateCount()
        }

        binding.btnNext.setOnClickListener {
            val intent = Intent(this@MainActivity, CodingChallengeActivity::class.java)
            startActivity(intent )
        }
    }
}