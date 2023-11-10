fun main() {
    print("Enter your age ")
    val grade = readln()!!.toInt()

    if(grade >= 90) {
        print("A")
    }

    if(grade in 80..89) {
        print("B")
    }

    if(grade in 70..79) {
        print("C")
    }

    if(grade < 70) {
        print("Fail")
    }

    println("End of App")
}