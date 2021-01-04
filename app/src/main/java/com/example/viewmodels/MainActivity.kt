package com.example.viewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var viewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)
        tvCounter.text=viewModel.count.toString()

        btnCounter.setOnClickListener{

        viewModel.addNumber()
         tvCounter.text=viewModel.count.toString()

        }


    }
}