package com.example.dashlane

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dashlane.databinding.ActivityMainBinding
import com.example.firstlibrarycreated.DesignToast

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        DesignToast.smartToast(this, "Gaddar Kumar Chaudhary")
    }
}