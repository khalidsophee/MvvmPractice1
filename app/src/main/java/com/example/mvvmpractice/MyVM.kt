package com.example.mvvmpractice

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

open class MyVM : ViewModel() {

    private var myrandom = MutableLiveData<Rds>()

    fun getNumber(): MutableLiveData<Rds> {
        if(myrandom==null)
        {
            myrandom=MutableLiveData()
            createNuber()
        }
        return myrandom
    }
    fun createNuber()
    {
        val f:String = (0..100).random().toString()
        val fg:String = (0..100).random().toString()
        val s= Rds(f,fg)
        Log.v("help",s.random1)
    }

}