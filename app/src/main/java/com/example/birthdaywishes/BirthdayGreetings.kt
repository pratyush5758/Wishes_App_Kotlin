package com.example.birthdaywishes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaywishes.databinding.ActivityBirthdayGreetingsBinding

class BirthdayGreetings : AppCompatActivity() {
    private lateinit var binding: ActivityBirthdayGreetingsBinding
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(NAME_EXTRA)
        binding.birthdayGreetings.text ="Happy BirthDay\n$name!"
    }
}