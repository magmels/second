class Car(private var brand_: String = "", private var year_: Int = 0) {
    val brand = brand
    val year = year_
    constructor(string: String) : this() {
        val car = string.split(' ')
        brand_ = car[0]
        year_ = car[1].toInt()
    }

    fun printDetails() {
        println("Brand: $brand_, Year: $year_")
    }


}