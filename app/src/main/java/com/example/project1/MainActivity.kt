package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Student(val name: String, var major: String, var schoolYear: Int) {
//    fun getName() : String {
//        return name
//    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stud = Student ("Bob", "CS", 3)
        stud.name
    }
}