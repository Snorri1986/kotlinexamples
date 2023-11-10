fun main() {
    print("Start APP\n")
    // simple for loop
    for(i in 1..5) {
        println("Number $i")
    }
    print("LOOP WITH STEP\n")
    // for loop with step
    for(i in 1..100 step 2) {
        println("Number $i")
    }
    print("LOOP DOWN TO\n")
    for(i in 100 downTo 1 step 2) {
        println("Number $i")
    }
    print("End APP")
}