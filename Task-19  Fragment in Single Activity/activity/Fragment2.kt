package com.example.task19b

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Fragment2 : Fragment() {

    val languages = arrayOf("Alpha","Beta","Cupcake","Donut","Eclair","Froyo","GingerBread","HoneyComb",
        "Ice Cream Sandwich","Jellybean","Kitkat","Lollipop","Marshmallow","Nougat","Oreo","Pie","Q")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_fragment2, container, false)

        val listView = view.findViewById<ListView>(R.id.id_listView)

        listView?.adapter = activity?.applicationContext?.let {
            ArrayAdapter(it,android.R.layout.simple_list_item_1,languages)
        }

        listView?.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(activity?.applicationContext,"${parent.getItemAtPosition(position)} @ ${position}th position", Toast.LENGTH_LONG).show()
        }

        return view
    }

}
