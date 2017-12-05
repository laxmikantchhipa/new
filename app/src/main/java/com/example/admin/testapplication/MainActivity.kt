package com.example.admin.testapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        System.out.println("test")
        System.out.println("test 234 ")

        System.out.println("first process is completed ")
        System.out.println("second process is completed")
        System.out.println("third process is completed")
    }


}
