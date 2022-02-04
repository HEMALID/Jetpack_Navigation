package com.example.jetpack_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class FourthFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment_fourth, container, false)
        val txt2=view?.findViewById<TextView>(R.id.txt2)
        view.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToFifthFrame) }
        return view
    }

}