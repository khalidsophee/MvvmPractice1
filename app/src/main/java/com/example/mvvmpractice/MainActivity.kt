package com.example.mvvmpractice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.*
import kotlinx.android.synthetic.main.activity_main.*
 import kotlin.math.log


class MainActivity : AppCompatActivity() {
     private lateinit var viewModel: MyVM
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


          viewModel = ViewModelProviders.of(this).get(MyVM::class.java)
          val randomm: LiveData<Rds>
          randomm=viewModel.getNumber()

            val nameObserver = Observer<Rds> { newName ->
                Log.v("CHECKING","we are in observer")
             // Update the UI, in this case, a TextView.
                 rand.text=newName.random1
                 rand2.text=newName.random2
                Log.v("CHECKING",newName.random1)
           }
           randomm.observe(this, nameObserver)
             check.setOnClickListener {
                 viewModel.createNuber()
             }
    }

}
