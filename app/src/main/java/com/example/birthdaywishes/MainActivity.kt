package com.example.birthdaywishes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaywishes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val name = binding.nameInput.editableText.toString()
       val intent = Intent(this, BirthdayGreetings::class.java)
            intent.putExtra(BirthdayGreetings.NAME_EXTRA, name)
            startActivity(intent)
        }
    }

}