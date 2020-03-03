package com.example.demo_app

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var image : ImageView? = null
    private var imageText : TextView? = null
    private var button  : Button? = null
    private var prevbutton  : Button? = null


    var  images = arrayOf(R.drawable.ic_android,R.drawable.ic_cake,R.drawable.ic_cloud,
        R.drawable.ic_education,R.drawable.ic_fingerprint,R.drawable.ic_macdesk,R.drawable.ic_music)
    var itsTexts = arrayOf("Android","Cake","Cloud","Education","Fingerprint","Mac Desktop","Music")

    var index : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        image = findViewById(R.id.id_image)
        imageText = findViewById(R.id.id_imageText)
        button = findViewById(R.id.id_next)
        prevbutton = findViewById(R.id.id_prev)

        Log.e("AXE","---> $index")
        button?.setOnClickListener {

            val v = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            v.vibrate(100)

            if (index == images.size){
                index = 0
            }else {
                image?.setImageResource(images[index])
                imageText?.text = itsTexts[index]
                ++index
            }
        }

        prevbutton?.setOnClickListener {

            val v = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            v.vibrate(100)
            if(index == 0){
                index = images.size-1
                showPrevImage()
            }else {
                showPrevImage()
            }
        }
    }
    private fun showPrevImage(){
        image?.setImageResource(images[index])
        imageText?.text = itsTexts[index]
        index--
    }
}
