package com.example.spinner

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {

            if (spinner.selectedItem.toString().equals("Red")){
                tv1.setTextColor(Color.RED)
            }else if (spinner.selectedItem.toString().equals("Blue")){
                tv1.setTextColor(Color.BLUE)
            }else if (spinner.selectedItem.toString().equals("Green")){
                tv1.setTextColor(Color.GREEN)
            }
            tv1.text = spinner.selectedItem.toString()
        }
    }

    override fun onStart() {

        var op:ArrayList<String> = arrayListOf("Red","Blue","Green")
        var adapter:ArrayAdapter<String> = ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,op)
        spinner.adapter = adapter

        super.onStart()
    }
}
