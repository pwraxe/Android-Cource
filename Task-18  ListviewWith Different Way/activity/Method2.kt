package com.example.task18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.task18.databinding.ActivityMethod2Binding

class Method2 : AppCompatActivity() {


    private var binding : ActivityMethod2Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_method2)
        val langArray = resources.getStringArray(R.array.languages)     //fetch data from resource

        binding?.idListMethod2?.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,langArray)
        binding?.idListMethod2?.setOnItemClickListener { parent, _, position, _ ->

            Toast.makeText(this,"${parent.getItemAtPosition(position)}",Toast.LENGTH_LONG).show()
        }


    }
}

