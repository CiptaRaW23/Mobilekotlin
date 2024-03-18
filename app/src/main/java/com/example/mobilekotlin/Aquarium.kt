package example.myapp

import java.lang.Math.PI
open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open var water: Double = 0.0
        get() = volume * 0.9

    open val shape = "rectangle"
    var numberOfFish = 0

    init {
        println("aquarium initializing")
    }

    init {
        println("Volume: ${width * length * height / 1000} liters")
    }

    //constructor sekunder
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println(
            "Shape: $shape" +
                    "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm " +
                    "Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)"
        )
    }


    class TowerTank(override var height: Int, var diameter: Int) :
        Aquarium(height = height, width = diameter, length = diameter) {
        override var volume: Int
            get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
            set(value) {
                height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
            }
        override var water = volume * 0.8
        override val shape = "cylinder"
    }
}