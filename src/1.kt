class Person(var name : String = "", var age : Int = 0) {
    fun hello() {
        println("Меня зовут $name, мне $age")
    }
}

class Dish (
    val id : Int,
    val name : String,
    val category: String,
    val ingredients : List<String>,
    val inFavorites : Boolean = false,
) {

}
