package com.example.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.baseactivity.R

abstract class BaseActivity : AppCompatActivity() {

    abstract fun getLayoutID() : Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutID())
    }
}