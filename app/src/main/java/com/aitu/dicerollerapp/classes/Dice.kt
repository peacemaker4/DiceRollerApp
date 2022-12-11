package com.aitu.dicerollerapp.classes

class Dice(val sides: Int){
    fun roll():Int{
        return (1..sides).random()
    }
}