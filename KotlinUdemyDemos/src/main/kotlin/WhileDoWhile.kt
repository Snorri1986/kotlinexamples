fun main() {

    println("For Loop")
    for(i in 1..10 step 1) {
        println("counter $i")
    }

    var i = 1

    println("While Loop")
    while(i <= 10) {
        println("counter $i")
        i++
    }

    i = 1
    println("DoWhile Loop")
    do {
        println("counter $i")
        i++
    }while(i <= 10)
}