package com.example.mobilekotlin

data class Decoration(val rocks: String) {
}
fun makeDecoration() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
}
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}
enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main(){
    makeDecoration()
    makeDecorations()
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}
