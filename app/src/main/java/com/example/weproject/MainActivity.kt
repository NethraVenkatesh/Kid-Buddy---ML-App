package com.example.weproject

import android.annotation.SuppressLint
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.example.weproject.paintview.Companion.pathList

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    private var numbers = listOf(R.drawable.zero, R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eigth, R.drawable.nine)

    companion object{

        var path = Path()
        var paintBrush = Paint()
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.random).setOnClickListener{
            val r = (numbers).shuffled().first()
            findViewById<ImageView>(R.id.display).setImageResource(r)

        }

        val paint_button = findViewById<ImageButton>(R.id.pen)
        val reset = findViewById<ImageButton>(R.id.clear)

        paint_button.setOnClickListener {

            Toast.makeText(this, "Paint Brush selected", Toast.LENGTH_SHORT).show()
        }

        reset.setOnClickListener {

            Toast.makeText(this, "Board is reseted!", Toast.LENGTH_SHORT).show()
            pathList.clear()
            path.reset()
        }


    }


}