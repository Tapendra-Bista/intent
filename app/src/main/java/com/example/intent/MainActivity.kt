package com.example.intent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private  lateinit var  username :EditText
    private lateinit var  age : EditText
    private  lateinit var  button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.name_id)
        age = findViewById(R.id.age_id)
        button = findViewById(R.id.submit_id)
        button.setOnClickListener {
val intent = Intent(this@MainActivity,MainActivity2::class.java)
startActivity(intent)
            val usernamex:String = username.text.toString()
            val agex :String = age.text.toString()

intent.putExtra("username",usernamex)
            intent.putExtra(
                "age",agex
            )

        }
    }
}