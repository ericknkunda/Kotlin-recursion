package Inheritance

class Temperature(var celsius: Float)


    fun main(args: Array<String>) {
        val t = Temperature(40f)
        println("To fahr ${t.fahrenheit}")

        t.fahrenheit = 85f
        println("To cel ${t.celsius}")
    }
    var Temperature.fahrenheit: Float
        get() = (celsius * 9 / 5) + 32
        set(value) {
            celsius = (value - 32) * 5 / 9
        }
