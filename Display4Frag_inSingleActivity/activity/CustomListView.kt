package com.example.task19

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.task19.databinding.FragmentCustomListViewBinding


class CustomListView : Fragment() {

    private var binding : FragmentCustomListViewBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_custom_list_view,null,false)

        binding?.idCustomList?.adapter = CustomAdapter(activity?.applicationContext,resources.getStringArray(R.array.languages))

        return binding?.root
    }


}
