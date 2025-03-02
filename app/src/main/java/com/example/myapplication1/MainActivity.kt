package com.example.myapplication1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

         val teamScore=teamScores()
         val teamA:TextView=findViewById(R.id.a_score)
         val teamB:TextView=findViewById(R.id.b_score)

         findViewById<Button>(R.id.a_1).setOnClickListener{
             teamScore.addOne("A")
             teamA.text=teamScore.getTotal("A").toString()
         }
         findViewById<Button>(R.id.a_2).setOnClickListener{
             teamScore.addTwo("A")
             teamA.text=teamScore.getTotal("A").toString()
         }
         findViewById<Button>(R.id.a_3).setOnClickListener{
             teamScore.addThree("A")
             teamA.text=teamScore.getTotal("A").toString()
         }
         findViewById<Button>(R.id.b_1).setOnClickListener{
             teamScore.addOne("B")
             teamB.text=teamScore.getTotal("B").toString()
         }
         findViewById<Button>(R.id.b_2).setOnClickListener{
             teamScore.addTwo("B")
             teamB.text=teamScore.getTotal("B").toString()
         }
         findViewById<Button>(R.id.b_3).setOnClickListener{
             teamScore.addThree("B")
             teamB.text=teamScore.getTotal("B").toString()
         }

    }






}