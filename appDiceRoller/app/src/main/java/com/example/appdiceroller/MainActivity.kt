package com.example.appdiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //val rollButton: Button = findViewById(R.id.button)
        val rollButton = findViewById<Button>(R.id.rollButton)



       /* rollButton.setOnClickListener {
            //val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            //toast.show()
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = "6"

        }*/

        class Dice(val numSides: Int){
            fun roll(): Int {
                return (1..numSides).random()
            }
        }

        rollButton.setOnClickListener {
            rollDice()
        }


    }


    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}