package example.mobilekotlin

import com.example.mobilekotlin.Plecostomus
import com.example.mobilekotlin.Shark

fun buildAquarium() {
    val aquarium4 = Aquarium(width = 25, length = 25, height = 40)
    aquarium4.printSize()
    val myTower = Aquarium.TowerTank( diameter = 25, height = 40)
    myTower.printSize()
}
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}
fun main(){
    buildAquarium()
    makeFish()
}