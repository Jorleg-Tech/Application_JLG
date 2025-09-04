package com.jorleg.flashcardjorleg

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flashcard_Question = findViewById<TextView>(R.id.flashcard_question)
        val flashcard_Answer = findViewById<TextView>(R.id.flashcard_answer)
        flashcard_Question.setOnClickListener {
            flashcard_Question.visibility = View.INVISIBLE
            flashcard_Answer.visibility = View.VISIBLE
        }

        flashcard_Answer.setOnLongClickListener {
            flashcard_Answer.visibility = View.INVISIBLE
            flashcard_Question.visibility = View.VISIBLE
            true
        }
    }
}

