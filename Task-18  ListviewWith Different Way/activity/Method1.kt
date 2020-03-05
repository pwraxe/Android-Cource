package com.example.task18

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.task18.databinding.ActivityMainBinding
import com.example.task18.databinding.ActivityMethod1Binding

class Method1 : AppCompatActivity() {

    private var lang = arrayOf("C","C++","Java","Kotlin","XML","HTML","SMTP","Android","PHP","Python",
        "Xamarin","GitLab","Flutter","iOS","Swift","Go","Ruby","R","Angular","JavaScript")

    private var binding : ActivityMethod1Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_method1)

        binding?.idListMethod1?.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,lang)
        binding?.idListMethod1?.setOnItemClickListener { parent, _, position, _ ->

            val lang = parent.getItemAtPosition(position).toString()
            Toast.makeText(this,"$lang : @ position $position",Toast.LENGTH_LONG).show()
        }

    }
}
