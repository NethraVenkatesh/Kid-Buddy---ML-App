package com.example.weproject

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.weproject.databinding.FragmentFavBinding
import com.example.weproject.databinding.FragmentLogoutBinding
import com.google.firebase.auth.FirebaseAuth


class logoutFragment : Fragment() {

    private var _binding: FragmentLogoutBinding? = null
    private val binding get() = _binding!!
    private lateinit var user: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLogoutBinding.inflate(inflater, container,false)

        user = FirebaseAuth.getInstance()

        binding.yesbutton.setOnClickListener {
            user.signOut()
            val intent = Intent(this@logoutFragment.requireContext(), SignInActivity::class.java)
            startActivity(intent)
        }

        binding.nobutton.setOnClickListener {
            user.signOut()
            Toast.makeText(activity, "Yay! You did not Leave.", Toast.LENGTH_SHORT).show()
        }



        return binding.root
    }


}