package com.example.s4uelistview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.s4uelistview.R.id.lsvSO

class MainActivity : AppCompatActivity() {
    var arrSO=arrayOf("Android","IOS","Windows Phone",
        "Blackberry OS","Firefox OS","Amazon World","Nokia")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsvSistemasOperativos:ListView=findViewById(lsvSO)

        val adaptador: Any? =
            ArrayAdapter<Any?>(this,android.R.layout.simple_list_item_1,arrSO)
        lsvSistemasOperativos.adapter=adaptador as ListAdapter?
        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext, "Estoy en la posición: $position",Toast.LENGTH_LONG).show()

        }
    }
}