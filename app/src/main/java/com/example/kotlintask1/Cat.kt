package com.example.kotlintask1

data class Cat(val name: String, val age:Int) {
    override fun toString(): String {
        return "Кот "+name+", возраст: "+age
    }
}
