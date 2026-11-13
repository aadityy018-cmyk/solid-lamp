package com.aadityy.solidlamp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aadityy.solidlamp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.greetingText.text = getString(R.string.hello_world)
    }
}
