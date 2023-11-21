fun main() {
    println("Pets app")

    //using Array
    val maxSize = 5
    var listOfPets:Array<String> = Array(maxSize){""}

    for(i in 0 until maxSize-1) {
        listOfPets[i] = readln()
    }

    for(i in 0 until maxSize-1) {
        println("Pet $i: ${listOfPets[i]}")
    }
}