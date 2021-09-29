package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "On Create")
    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", " Start")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","Resume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","Destroy")
    }

}