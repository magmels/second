fun main() {
    val egor = Person("Егор", 22)
    egor.hello()
    val omlet = Dish(
        id = 1,
        name = "Омлет",
        category = "Завтраки",
        ingredients = listOf("3 яйца", "100 мл молока", "Шепотка соли", "Немного зелени")
    )
    val carbonara = Dish(
        id = 12,
        name = "Паста Карбонара",
        category = "Обеды",
        ingredients = listOf("2 желтка", "макароны сухие 80 г", "бекон", "сливки"),
        inFavorites = true
    )

    println(omlet.name)
    println(omlet.category)
    println(omlet.ingredients)
    println()
    println(carbonara.name)
    println(carbonara.category)
    println(carbonara.ingredients)


}