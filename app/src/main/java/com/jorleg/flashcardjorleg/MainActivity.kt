package com.jorleg.flashcardjorleg

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flashcard_Question_1 = findViewById<TextView>(R.id.flashcard_question_1)
        val flashcard_Answer_1_1 = findViewById<TextView>(R.id.flashcard_answer_1_1)
        val flashcard_Answer_1_2 = findViewById<TextView>(R.id.flashcard_answer_1_2)
        val flashcard_Answer_1_3 = findViewById<TextView>(R.id.flashcard_answer_1_3)


        val flashcard_Question_2 = findViewById<TextView>(R.id.flashcard_question_2)
        val flashcard_Answer_2_1 = findViewById<TextView>(R.id.flashcard_answer_2_1)
        val flashcard_Answer_2_2 = findViewById<TextView>(R.id.flashcard_answer_2_2)
        val flashcard_Answer_2_3 = findViewById<TextView>(R.id.flashcard_answer_2_3)




        val imageView1=findViewById<ImageView>(R.id.imageView1)
        val imageView2=findViewById<ImageView>(R.id.imageView2)
        val imageView3=findViewById<ImageView>(R.id.imageView3)
        val imageView4=findViewById<ImageView>(R.id.imageView4)
        val imageView5=findViewById<ImageView>(R.id.imageView5)
        val imageView6=findViewById<ImageView>(R.id.imageView6)

        val relativeLayoutContainer = findViewById<android.widget.RelativeLayout>(R.id.RelativeLayout)



        // Code relative à l'affichage de la première question

        flashcard_Answer_1_1.setOnClickListener {
            flashcard_Answer_1_1.background = getDrawable(R.drawable.card_backgrounds)
            flashcard_Answer_1_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_3.background = getDrawable(R.drawable.card_backgrounda)
            imageView1.visibility = View.VISIBLE
        }
        flashcard_Answer_1_2.setOnClickListener {
            flashcard_Answer_1_2.background = getDrawable(R.drawable.card_background)
            flashcard_Answer_1_1.background = getDrawable(R.drawable.card_backgrounds)
            flashcard_Answer_1_3.background = getDrawable(R.drawable.card_backgrounda)
            imageView1.visibility = View.VISIBLE
        }
        flashcard_Answer_1_3.setOnClickListener {
            flashcard_Answer_1_3.background = getDrawable(R.drawable.card_background)
            flashcard_Answer_1_1.background = getDrawable(R.drawable.card_backgrounds)
            flashcard_Answer_1_2.background = getDrawable(R.drawable.card_backgrounda)
            imageView1.visibility = View.VISIBLE

        }

        relativeLayoutContainer.setOnClickListener {
            flashcard_Answer_1_1.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_3.background = getDrawable(R.drawable.card_backgrounda)
            imageView1.visibility = View.INVISIBLE

        }

        imageView1.setOnClickListener {

            flashcard_Question_1.visibility = View.INVISIBLE

            flashcard_Answer_1_1.visibility = View.INVISIBLE
            flashcard_Answer_1_2.visibility = View.INVISIBLE
            flashcard_Answer_1_3.visibility = View.INVISIBLE


            flashcard_Question_2.visibility = View.VISIBLE

            flashcard_Answer_2_1.visibility = View.VISIBLE
            flashcard_Answer_2_2.visibility = View.VISIBLE
            flashcard_Answer_2_3.visibility = View.VISIBLE

            imageView1.visibility = View.INVISIBLE
            imageView5.visibility = View.VISIBLE
            imageView6.visibility = View.INVISIBLE

            imageView2.visibility = View.INVISIBLE
            imageView3.visibility = View.INVISIBLE


            flashcard_Answer_1_1.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_3.background = getDrawable(R.drawable.card_backgrounda)


            flashcard_Answer_2_1.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_2_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_2_3.background = getDrawable(R.drawable.card_backgrounda)


        }



        // Code relative à l'affichage de la deuxième question
        flashcard_Answer_2_1.setOnClickListener {
            flashcard_Answer_2_1.background = getDrawable(R.drawable.card_backgrounds)
            flashcard_Answer_2_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_2_3.background = getDrawable(R.drawable.card_backgrounda)
            imageView4.visibility = View.VISIBLE
        }
        flashcard_Answer_2_2.setOnClickListener {
            flashcard_Answer_2_2.background = getDrawable(R.drawable.card_background)
            flashcard_Answer_2_1.background = getDrawable(R.drawable.card_backgrounds)
            flashcard_Answer_2_3.background = getDrawable(R.drawable.card_backgrounda)
            imageView4.visibility = View.VISIBLE
        }
        flashcard_Answer_2_3.setOnClickListener {
            flashcard_Answer_2_3.background = getDrawable(R.drawable.card_background)
            flashcard_Answer_2_1.background = getDrawable(R.drawable.card_backgrounds)
            flashcard_Answer_2_2.background = getDrawable(R.drawable.card_backgrounda)
            imageView4.visibility = View.VISIBLE

        }

        relativeLayoutContainer.setOnClickListener {

            flashcard_Answer_1_1.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_3.background = getDrawable(R.drawable.card_backgrounda)


            flashcard_Answer_2_1.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_2_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_2_3.background = getDrawable(R.drawable.card_backgrounda)
            imageView1.visibility = View.INVISIBLE

        }


        imageView4.setOnClickListener {

            flashcard_Question_2.visibility = View.INVISIBLE

            flashcard_Answer_2_1.visibility = View.INVISIBLE
            flashcard_Answer_2_2.visibility = View.INVISIBLE
            flashcard_Answer_2_3.visibility = View.INVISIBLE

            imageView4.visibility = View.INVISIBLE
            imageView1.visibility = View.INVISIBLE



            flashcard_Question_1.visibility = View.VISIBLE

            flashcard_Answer_1_1.visibility = View.VISIBLE
            flashcard_Answer_1_2.visibility = View.VISIBLE
            flashcard_Answer_1_3.visibility = View.VISIBLE


            imageView5.visibility = View.INVISIBLE
            imageView6.visibility = View.INVISIBLE

            imageView2.visibility = View.VISIBLE
            imageView3.visibility = View.VISIBLE


            flashcard_Answer_1_1.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_3.background = getDrawable(R.drawable.card_backgrounda)


            flashcard_Answer_2_1.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_2_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_2_3.background = getDrawable(R.drawable.card_backgrounda)

        }




        imageView2.setOnClickListener {
            flashcard_Answer_1_1.visibility= View.INVISIBLE
            flashcard_Answer_1_2.visibility= View.INVISIBLE
            flashcard_Answer_1_3.visibility= View.INVISIBLE


            flashcard_Answer_2_1.visibility= View.INVISIBLE
            flashcard_Answer_2_2.visibility= View.INVISIBLE
            flashcard_Answer_2_3.visibility= View.INVISIBLE

            imageView1.visibility= View.INVISIBLE
            flashcard_Answer_1_1.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_1_3.background = getDrawable(R.drawable.card_backgrounda)


            imageView2.visibility= View.INVISIBLE
            imageView3.visibility= View.VISIBLE

            imageView5.visibility= View.INVISIBLE
            imageView6.visibility = View.INVISIBLE

        }

        imageView3.setOnClickListener {
            flashcard_Answer_1_1.visibility = View.VISIBLE
            flashcard_Answer_1_2.visibility = View.VISIBLE
            flashcard_Answer_1_3.visibility = View.VISIBLE

            flashcard_Answer_2_1.visibility= View.INVISIBLE
            flashcard_Answer_2_2.visibility= View.INVISIBLE
            flashcard_Answer_2_3.visibility= View.INVISIBLE


            imageView2.visibility = View.VISIBLE
            imageView3.visibility = View.INVISIBLE

            imageView5.visibility= View.INVISIBLE
            imageView6.visibility = View.INVISIBLE

        }

        imageView5.setOnClickListener {
            flashcard_Answer_1_1.visibility = View.INVISIBLE
            flashcard_Answer_1_2.visibility = View.INVISIBLE
            flashcard_Answer_1_3.visibility = View.INVISIBLE

            flashcard_Answer_2_1.visibility= View.INVISIBLE
            flashcard_Answer_2_2.visibility= View.INVISIBLE
            flashcard_Answer_2_3.visibility= View.INVISIBLE


            imageView4.visibility = View.INVISIBLE
            flashcard_Answer_2_1.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_2_2.background = getDrawable(R.drawable.card_backgrounda)
            flashcard_Answer_2_3.background = getDrawable(R.drawable.card_backgrounda)


            imageView2.visibility = View.INVISIBLE
            imageView3.visibility = View.INVISIBLE

            imageView5.visibility= View.INVISIBLE
            imageView6.visibility = View.VISIBLE

        }

        imageView6.setOnClickListener {
            flashcard_Answer_1_1.visibility = View.INVISIBLE
            flashcard_Answer_1_2.visibility = View.INVISIBLE
            flashcard_Answer_1_3.visibility = View.INVISIBLE

            flashcard_Answer_2_1.visibility= View.VISIBLE
            flashcard_Answer_2_2.visibility= View.VISIBLE
            flashcard_Answer_2_3.visibility= View.VISIBLE


            imageView2.visibility = View.INVISIBLE
            imageView3.visibility = View.INVISIBLE

            imageView5.visibility= View.VISIBLE
            imageView6.visibility = View.INVISIBLE

        }


    }
}

