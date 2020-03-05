package com.example.task18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.task18.databinding.ActivityMethod3Binding

class Method3 : AppCompatActivity() {

    private var lang = arrayOf("C","C++","Java","Kotlin","XML","HTML","SMTP","Android","PHP","Python",
        "Xamarin","GitLab","Flutter","iOS","Swift","Go","Ruby","R","Angular","JavaScript")

    private var binding : ActivityMethod3Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_method3)
        binding?.idListMethod3?.adapter = ArrayAdapter(this,R.layout.custom_design,R.id.id_text,lang)
        binding?.idListMethod3?.setOnItemClickListener { parent, _, position, _ ->
            Toast.makeText(this,"${parent.getItemAtPosition(position)}",Toast.LENGTH_LONG).show()
        }

    }
}
