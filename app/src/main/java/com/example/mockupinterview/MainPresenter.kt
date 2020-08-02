package com.example.mockupinterview

import android.util.Log

class MainPresenter {
    private lateinit var view : MainView
    private var finalResult : Int = 0

    fun setView(view: MainView){
        this.view = view
    }

    fun result(score1 : Int, score2 : Int) {
        if (score1 > score2) {
            view.getResult("Player 1 Win")
            Log.d( "result: ", "Player 1 Win")
        }else if (score2 > score1) {
            view.getResult("Player 2 Win")
            Log.d( "result: ", "Player 2 Win")
        }else{
            view.getResult("Draw")
            Log.d("result: ", "Draw")
        }
    }

    fun diceScore ( number : Int) : Int {
        var score = 0
        when (number) {
            1 -> {
                score = 5
                Log.d("Angka", "1")
                Log.d("Score", "5")
            }
            3 -> {
                score = 5
                Log.d("Angka", "3")
                Log.d("Score", "5")
            }
            5 -> {
                score = 5
                Log.d("Angka", "5")
                Log.d("Score", "5")
            }
            2 -> {
                score = -3
                Log.d("Angka", "2")
                Log.d("Score", "-3")
            }
            4 -> {
                score = -3
                Log.d("Angka", "4")
                Log.d("Score", "-3")
            }
            6 -> {
                score = -3
                Log.d("Angka", "6")
                Log.d("Score", "-3")
            }
        }
        return score
    }

}