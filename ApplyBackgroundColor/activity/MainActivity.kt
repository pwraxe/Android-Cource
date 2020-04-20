package com.example.applycolor2background

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var parentLayout : RelativeLayout? = null
    private var applyButton : Button? = null
    private var nextColor : TextView? = null


    private val backColor = arrayOf("Black","Yellow","Blue","Red","Green","Cyan","Dark Gray","Gray","Light Gray","Magenta","Transparent")
    private val colors = intArrayOf(Color.BLACK, Color.YELLOW, Color.BLUE, Color.RED, Color.GREEN, Color.CYAN, Color.DKGRAY, Color.GRAY, Color.LTGRAY, Color.MAGENTA, Color.TRANSPARENT)

    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        parentLayout = findViewById(R.id.id_parent)
        applyButton = findViewById(R.id.id_btn_apply)
        nextColor =  findViewById(R.id.id_nextColor)


        parentLayout?.setBackgroundColor(colors[index])
        nextColor?.text = "Next Color : ${backColor[index+1]}"
        nextColor?.setTextColor(colors[index+1])

        applyButton?.setOnClickListener {

            index++

            if(index == backColor.size){
                index = -1
            }else{
                parentLayout?.setBackgroundColor(colors[index])
                try {
                    nextColor?.text = "Next Color : ${backColor[index+1]}"
                    nextColor?.setTextColor(colors[index+1])
                }catch (aioobe : ArrayIndexOutOfBoundsException){
                    //index = -1
                    nextColor?.text = "Next Color : ${backColor[0]}"
                    nextColor?.setTextColor(colors[0])

                }

            }
        }



    }
}
