class Student(var name : String = "", var age : Int = 0) {
    constructor(str : String) : this() {
        val stud = str.split(' ')
        this.name = stud[0]
        this.age = stud[1].toInt()
    }

    fun printInfo() {
        println("Name: $name, Age: $age")
    }
}