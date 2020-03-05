package com.example.task14

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.task14.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity(){


    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding?.idLoadImgButton?.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"         // whatYouWant / typeOfIt
            startActivityForResult(intent,1526)
        }
        binding?.idTakePic?.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,2615)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK && requestCode == 1526) {
            val imageUri = data?.data
            binding?.idImgLoadArea?.setImageURI(imageUri)
        }
        else if(resultCode == Activity.RESULT_OK && requestCode == 2615){
            //val imageUri = data?.data
            val bitmap = data?.extras?.get("data") as Bitmap
            binding?.idImgLoadArea?.setImageBitmap(bitmap)
        }
    }
}
