package com.example.mockupinterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_input_nama2.*

class InputNamaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_nama2)

        btn_next.setOnClickListener {
            val nama = et_input_nama.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("nama" , nama)
            startActivity(intent)
            finish()
        }

    }
}