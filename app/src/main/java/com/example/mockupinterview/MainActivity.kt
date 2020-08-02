package com.example.mockupinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    var click1 = true
    var click2 = true
    var score1 = 0
    var score2 = 0
    private lateinit var mainPresenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter = MainPresenter()
        mainPresenter.setView(this)

        val nama1 = intent.getStringExtra("nama1")
        tv_nama1.text = nama1
        val nama2 = intent.getStringExtra("nama2")
        tv_nama2.text = nama2

        btn_roll1.setOnClickListener {
            if (click1) {
                val dadu = mutableListOf(1,2,3,4,5,6)
                val random = dadu.random()
                tv_angka1.text = random.toString()
                score1 = mainPresenter.diceScore(random)
                tv_score1.text = score1.toString()
                click1 = false
                if (score2 != 0){
                    mainPresenter.result(score1, score2)
                }else{
                    Toast.makeText(this, "Pemain 2 Silahkan Lempar Dadu", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Game Sudah Berakhir, Reset Dahulu", Toast.LENGTH_SHORT).show()
            }
        }

        btn_roll2.setOnClickListener {
            if (click2) {
                val dadu = mutableListOf(1,2,3,4,5,6)
                val random = dadu.random()
                tv_angka2.text = random.toString()
                score2 = mainPresenter.diceScore(random)
                tv_score2.text = score2.toString()
                click2 = false
                if (score1 != 0) {
                    mainPresenter.result(score1, score2)
                }else {
                    Toast.makeText(this, "Pemain 1 Silahkan Lempar Dadu", Toast.LENGTH_SHORT).show()
                }
            }else {
                Toast.makeText(this, "Game Sudah Berakhir, Reset Dahulu", Toast.LENGTH_SHORT).show()

            }
        }

        btn_reset.setOnClickListener {
            score1 = 0
            score2 = 0
            click1 = true
            click2 = true
            tv_hasil.text = ""
        }


    }

    override fun getResult(result: String) {
        tv_hasil.text = result
    }


}