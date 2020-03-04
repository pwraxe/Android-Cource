package com.example.task19

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter(var context: Context?,var lang : Array<String>) : BaseAdapter()
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater =   context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.custom_grid,null,false)
        val lang = view.findViewById<TextView>(R.id.id_langName)
        val languages = context?.resources?.getStringArray(R.array.languages)
        lang?.text = languages?.get(position)
        return view

    }

    override fun getItem(position: Int): Any = position

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = lang.size

}
