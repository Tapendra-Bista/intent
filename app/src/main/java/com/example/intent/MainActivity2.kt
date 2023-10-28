package com.example.intent
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.intent.R.*

class MainActivity2 : AppCompatActivity() {
    private lateinit var  view:TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main2)
        view = findViewById(id.text_id)
 val name = intent.getStringExtra("username").toString()
  val age = intent.getStringExtra("age").toString()

        view.text = "Your name is $name  and age is $age "
    }
}