package com.example.task18

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomLayout(private var context: Context,private var array: Array<String>) : BaseAdapter(){

    private var textView : TextView? = null

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.custom_design,parent,false)
        textView = view.findViewById(R.id.id_text)
        textView?.text = array[position]
        return view
    }

    override fun getItem(position: Int): Any = array[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = array.size

}