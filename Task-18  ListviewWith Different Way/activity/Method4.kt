package com.example.task18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.task18.databinding.ActivityMethod4Binding

class Method4 : AppCompatActivity() {

    private var lang = arrayOf("C","C++","Java","Kotlin","XML","HTML","SMTP","Android","PHP","Python",
        "Xamarin","GitLab","Flutter","iOS","Swift","Go","Ruby","R","Angular","JavaScript")

    private var binding : ActivityMethod4Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_method4)


        binding?.idListMethod4?.adapter = CustomLayout(this,lang)
        binding?.idListMethod4?.setOnItemClickListener { parent, _, position, _ ->
            Toast.makeText(this,"${parent.getItemAtPosition(position)}", Toast.LENGTH_LONG).show()
        }
    }
}
