package com.aitu.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.aitu.dicerollerapp.classes.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.roll_button)

        rollBtn.setOnClickListener{ rollDice() }

        rollDice()
    }

    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
    }
}