fun main() {
    print("Enter your age ")
    val grade = readln()!!.toInt()

    if(grade >= 90) {
        print("A")
    } else if(grade in 80..89) {
        print("B")
    } else if(grade in 70..79) {
        print("C")
    } else if(grade < 70) {
        print("Fail")
    }

    println("End of App")
}