fun main() {
    /*val radius = readln().toDouble()
    val circle = Circle(radius)
    circle.printInfo()

    var n = readln().toInt()
    val listOfStudent = mutableListOf<Student>()

    while (n-- > 0) listOfStudent.add(Student(readln()))

    for (student in listOfStudent) student.printInfo()

    var n = readln().toInt()
    val logs = mutableListOf<String>()

    while (n-- > 0) logs.add(readln())
    logs.forEach { Logger.log(it) }

    val n = readln().toInt()
    val triangles = List<Triangle>(n) {Triangle()} */

    for(i in 0..<n) {
        val input = readln().split(" ")
        triangles[i].set(input[0].toDouble(),
            input[1].toDouble(), input[2].toDouble())
    }
    triangles.forEach { println(it.isEquilateral())}

    var n = readln().toInt()
    val cars = mutableListOf<Car>()

    while(n-- > 0) cars.add(Car(readln()))
    cars.forEach { it.printDetails() }
}
