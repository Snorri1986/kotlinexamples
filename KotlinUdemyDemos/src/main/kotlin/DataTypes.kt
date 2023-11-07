fun main() {
    val name = "Denys"
    val age = 37
    val GPA = 3.9

    println("======= User info ===========")
    println("Name $name")
    println("Age $age")
    println("GPA $GPA")


    var department:String
    department = "Software engineering" // throws an error without initialization
    print("Department $department")

    var departmentWithNull:String?  // null save tik
    departmentWithNull = "Software engineering"
    print("Department $departmentWithNull")
}