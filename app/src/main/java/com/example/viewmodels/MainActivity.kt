package com.example.viewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.frag_two.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment();


    }

    private fun addFragment() {
//Creating instance of fragment
        val fragOne=RandomNumberFragment()
        //Creating manager
        val manager=supportFragmentManager
        //Creating transaction
        val transaction=manager.beginTransaction()
        //Adding fragment to layout
        transaction.add(R.id.frameLayout,fragOne)
        //commit
        transaction.commit()
    }
}