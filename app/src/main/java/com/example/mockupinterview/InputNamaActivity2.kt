package com.example.mockupinterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_input_nama2.*

class InputNamaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_nama2)

        btn_next.setOnClickListener {
            val nama1 = et_input_nama1.text.toString()
            val nama2 = et_input_nama2.text.toString()

            if (nama1 != "" && nama2 != "") {

                Log.d("Pemain 1 ", nama1)
                Log.d("Pemain 2 ", nama2)

                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("nama1" , nama1)
                intent.putExtra("nama2", nama2)
                startActivity(intent)
                finish()
            }else {
                Toast.makeText(this, "Mohon Memasukan Nama Pemain", Toast.LENGTH_SHORT).show()
            }

        }
    }
}