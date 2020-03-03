package com.example.pract_widgets


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    private var et_autoComp : MultiAutoCompleteTextView? = null

    private var suggestion = arrayOf("a","aa","aaa","b","bbb","bbbb","c","cc","ccc","cccc",
        "d","dd","dddd","e","ee","eee","eeee")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_autoComp = findViewById(R.id.id_multiAutoCompleteTextView)

        val et_adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestion)
        et_autoComp?.setAdapter(et_adapter)
        et_autoComp?.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())


    }
}