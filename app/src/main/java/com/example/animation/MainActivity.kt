package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        binding.headertitle.startAnimation(ttb)
        binding.subtitle.startAnimation(ttb)

        val stb = AnimationUtils.loadAnimation(this,R.anim.stb)
        binding.icCards.startAnimation(stb)

        val btt = AnimationUtils.loadAnimation(this,R.anim.btt)
        val btt2 = AnimationUtils.loadAnimation(this,R.anim.btt2)
        val btt3 = AnimationUtils.loadAnimation(this,R.anim.btt3)

        binding.llOne.startAnimation(btt)
        binding.llTwo.startAnimation(btt2)
        binding.llThree.startAnimation(btt3)

        val btt4 = AnimationUtils.loadAnimation(this,R.anim.btt_course)
        binding.btnNextCourse.startAnimation(btt4)

    }
}