package com.yousufjamil.YousufKitchen

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class RecipeOfTea : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val animDrawable = root_layout2.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(500)
        animDrawable.start()

        BackBtn.setOnClickListener {
            val leagueIntent = Intent(this, MainActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}