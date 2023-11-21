fun main() {
    println("Continue example")
    for(number in 1..10) {
        if(number == 5) {
            continue;
        }
      println(number)
    }

    println("Break example")
    for(number in 1..10) {
        if(number == 5) {
            break;
        }
        println(number)
    }

    println("Break Inner Example")
    loop@ for(number in 1..10) {
        println("number: $number")
        for(innerLoop in 1..7) {
            println("innerLoop: $innerLoop")
            if(innerLoop == 6) {
                break@loop
            }
        }
    }
}