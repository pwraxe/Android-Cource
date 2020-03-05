package com.example.task9

import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var ratingBar : RatingBar? = null
    private var container : LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar = findViewById(R.id.id_ratingBar)
        container = findViewById(R.id.id_container)


        ratingBar?.setOnRatingBarChangeListener { ratingBars, rating, fromUser ->

            when(rating.toInt()){
                1 -> {
                    container?.setBackgroundColor(Color.GRAY)
                    showToast(rating.toInt())

                }
                2 -> {
                    container?.setBackgroundColor(Color.MAGENTA)
                    showToast(rating.toInt())
                }
                3 -> {
                    container?.setBackgroundColor(Color.BLUE)
                    showToast(rating.toInt())

                }
                4 -> {
                    container?.setBackgroundColor(Color.CYAN)
                    showToast(rating.toInt())
                }
                5 -> {
                    container?.setBackgroundColor(Color.GREEN)
                    showToast(rating.toInt())
                }
            }

        }

    }

    private fun showToast(ratings: Int) {
        Toast.makeText(this,"Ratings : $ratings",Toast.LENGTH_LONG).show()
    }
}
