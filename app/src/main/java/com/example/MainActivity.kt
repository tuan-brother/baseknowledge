package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import com.example.baseactivity.R
import com.example.baseactivity.databinding.ActivityMainBinding
import com.example.ui.search.SearchFragment
import com.example.ui.user.UserViewModel
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val firebaseAnalytics: FirebaseAnalytics by lazy {
        Firebase.analytics
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.tvTest.setOnClickListener {
            val bundle = Bundle()

            val clicked = "yes" // yes-no or 1-0 depending on your app behavior
            bundle.putString("email_feedback", clicked);
            firebaseAnalytics.logEvent("app_review_request", bundle)
        }
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.add(R.id.container, SearchFragment.constrain()).commit()
    }
}