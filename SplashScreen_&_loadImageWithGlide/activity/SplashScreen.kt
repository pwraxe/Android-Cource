package com.example.app_sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.Toast

class SplashScreen : AppCompatActivity() {

    private var lock : ImageView? = null
    private var fig_print : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },3000)

        lock = findViewById(R.id.id_img_lock)
        fig_print = findViewById(R.id.id_fingerprint)

        fig_print?.setOnLongClickListener{

            lock?.setImageResource(R.drawable.ic_unlock)
            Toast.makeText(this,"Unlocked",Toast.LENGTH_LONG).show()
            return@setOnLongClickListener true
        }
        fig_print?.setOnClickListener {
            Toast.makeText(this,"Long Press on it",Toast.LENGTH_LONG).show()
        }
    }
}
