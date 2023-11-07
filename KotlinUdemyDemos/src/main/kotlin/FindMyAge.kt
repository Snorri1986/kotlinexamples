import java.util.Calendar

fun main() {
    print("Enter year of the birth")
    val yearOfBirth:Int = readln().toInt()
    val yearInDevice:Int = Calendar.getInstance().get(Calendar.YEAR)
    val age:Int = yearInDevice - yearOfBirth

    print("You are $age years old")
}