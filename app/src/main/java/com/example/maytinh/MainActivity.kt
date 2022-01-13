package com.example.maytinh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncong.setOnClickListener{
            var so1: Double=(etso1.text.toString()).toDouble()
            var so2:Double=(etso2.text.toString()).toDouble()
            val kq:Double= so1 + so2
            tvketqua.text=kq.toString()
        }
        btntru.setOnClickListener{
            var so1: Double=(etso1.text.toString()).toDouble()
            var so2:Double=(etso2.text.toString()).toDouble()
            val kq:Double= so1 - so2
            tvketqua.text=kq.toString()
        }
        btnnhan.setOnClickListener{
            var so1: Double=(etso1.text.toString()).toDouble()
            var so2:Double=(etso2.text.toString()).toDouble()
            val kq:Double= so1 * so2
            tvketqua.text=kq.toString()
        }
        btnchia.setOnClickListener{
            var so1: Double=(etso1.text.toString()).toDouble()
            var so2:Double=(etso2.text.toString()).toDouble()
            val kq:Double= so1 / so2
            tvketqua.text=kq.toString()
        }
    }
}