package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var redCheck : CheckBox? = null
    private var greenCheck : CheckBox? = null
    private var blueCheck : CheckBox? = null
    private var button  : Button? = null

    private var checkList : MutableList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //checkList.clear()
        redCheck =findViewById(R.id.id_redCheck)
        greenCheck = findViewById(R.id.id_greenCheck)
        blueCheck = findViewById(R.id.id_blueCheck)
        button = findViewById(R.id.id_button)


       button?.setOnClickListener {

           checkList = mutableListOf()

           if(redCheck!!.isChecked){
               checkList?.add(redCheck?.text.toString())
       }
           if(blueCheck!!.isChecked){
               checkList?.add("Blue")
           }
           if(greenCheck!!.isChecked){
               checkList?.add("Green")
           }

           if(checkList?.size!! > 0){
               Toast.makeText(this,"$checkList",Toast.LENGTH_LONG).show()
           }

       }



    }

}