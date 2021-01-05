package com.example.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    private  val TAG = "MainActivityViewModel"
    var count =0
      fun addNumber()
      {
          count++;
      }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "onCleared: ")
    }
}