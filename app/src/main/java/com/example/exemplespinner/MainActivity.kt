package com.example.exemplespinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txt : TextView
    lateinit var spinner : Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.txt)
        spinner = findViewById(R.id.spnr)

        var arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.govarnorates,
            android.R.layout.simple_spinner_dropdown_item
        )
        spinner.adapter = arrayAdapter

       spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
           override fun onNothingSelected(p0: AdapterView<*>?) {
               txt.setText("please select an item")
           }

           override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               txt.setText(" govarnorate selected is " + arrayAdapter.getItem(position) )
           }

       }

    }
}