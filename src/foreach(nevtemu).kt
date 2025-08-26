fun main() {
    val list = mutableListOf<String>()
    var input = readln()

    while (input != "") {
        list.add(input)
        input = readln()
    }

    //list.forEach { println(it) } // выводит все элементы
    val list1 = list.filter {
        it[0] == 'A' || it[0] == 'a'
    } // фильтрует по тем строкам, которые начинаются на А
    //list1.forEach { println(it) }

    val list2 = list.map { "$it\t$it" } // повторяет строку через таб
    list2.forEach { println(it) }
}