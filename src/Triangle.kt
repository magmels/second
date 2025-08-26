class Triangle(
    var side1: Double = 0.0,
    var side2: Double = 0.0,
    var side3: Double = 0.0,
) {
    fun set(side1 : Double, side2: Double, side3: Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }
    fun isEquilateral() : String{
        if (side1 == side2 && side2 == side3) return "Equilateral"
        return "Not Equilateral"
    }
}