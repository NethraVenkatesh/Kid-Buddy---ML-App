package com.example.weproject

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.weproject.databinding.FragmentFavBinding


class FavFragment : Fragment() {


    private var _binding: FragmentFavBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFavBinding.inflate(inflater, container,false)

        binding.shapes.setOnClickListener {
            val intent = Intent(this@FavFragment.requireContext(), MainActivity::class.java)
            startActivity(intent)
        }


        binding.numbers.setOnClickListener {
            Toast.makeText(activity, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }


}