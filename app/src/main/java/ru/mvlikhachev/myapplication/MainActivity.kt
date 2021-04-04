package ru.mvlikhachev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val text: TextView = findViewById(R.id.textView)

        var count = 0

        text.text = count.toString()

        button.setOnClickListener {
            count++
            text.text = count.toString()
        }

        Handler().postDelayed({
            val multithread = Multithread(3, text)
            multithread.doWork()
        }, 4000)

    }
}