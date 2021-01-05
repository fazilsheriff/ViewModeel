package com.example.viewmodels

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.frag_two.*


class RandomNumberFragment: Fragment(R.layout.frag_two) {

    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         viewModel = ViewModelProvider(requireActivity()).get(MainActivityViewModel::class.java)
//        tvCounter.text = viewModel.count.toString()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvCounter.text = viewModel.count.toString()

        btnCounter.setOnClickListener {

            viewModel.addNumber()
            tvCounter.text = viewModel.count.toString()
        }
    }



}