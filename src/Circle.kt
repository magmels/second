import kotlin.math.PI

class Circle(var radius : Double = 0.0) {
    var area = radius * radius * PI

    fun calcArea() {
        area = PI * radius * radius
    }
    fun printInfo() {
        println("Radius: $radius\n" +
                "Area: $area")
    }
}