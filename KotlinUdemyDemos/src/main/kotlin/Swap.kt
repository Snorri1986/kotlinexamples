fun main() {
    val temp:Int
    var number1:Int
    var number2:Int
    print("Enter first number: ")
    number1 = readln().toInt()
    print("Enter second number: ")
    number2 = readln().toInt()

    println("You entered: Number1: $number1 Number2: $number2")

    temp = number1
    number1 = number2
    number2 = temp

    println("After swapping: Number1: $number1 Number2: $number2")

}