fun main() {
    val isMarried = false
    val GPA = 3.8
    val isQualified = if (isMarried && GPA >= 3.8) 1 else 0
    print(isQualified)

    val isGood = when(GPA) {
        3.8 -> true
        else -> false
    }
    print(isGood)
}