fun main() {
    print("Pick some meal: ")
    val foodId = readln()!!.toInt()
    when(foodId) {
        1 -> {
            println("You got a sandwich")
        }

        10 -> {
            println("You got a burger")
        }

        else -> {
            println("You did not order anything")
        }
    }
}