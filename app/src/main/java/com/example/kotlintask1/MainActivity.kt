package com.example.kotlintask1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cat = Cat("Барсик",10)
        val cat2 = cat.copy("Мурзик");
        val cat3 = Cat("Черныш",5)

        val cats = arrayOf(cat,cat2,cat3)
        findViewById<Button>(R.id.btn_test).setOnClickListener {
            for (cat in cats){
                println(cat)
            }
        }
    }

}