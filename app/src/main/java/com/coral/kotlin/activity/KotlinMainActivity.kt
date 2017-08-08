package com.coral.kotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

import com.coral.kotlin.R

class KotlinMainActivity : AppCompatActivity() {

    private var btn: Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)

        btn = findViewById(R.id.btn) as Button?

        btn!!.setOnClickListener { Toast.makeText(null, "Hello kotlin", Toast.LENGTH_SHORT).show() }

        Log.e("xss", "sum = " + sum(1, 2))
        printSum(2, 3)
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * void 返回值类型，可省略 Unit
     */
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is $(a + b)")
    }


}
