package com.yousufjamil.YousufKitchen

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_french_toast.*

class FrenchToast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_french_toast)

        val animDrawable = layout_root.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(500)
        animDrawable.start()

        GoBackBtn.setOnClickListener {
            val leagueIntent = Intent(this, MainActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}