fun main() {
    for(i in 1..10 ) {
        print("Enter your name: ")
        val name = readln().toString()
        print("Where are you leave: ")
        val livePlace = readln().toString()
        var petName:String? = null
        for(petID in 1..3) {
            print("Enter Pet $petID:")
            petName = readln().toString()
        }

        println("======= User info ========")
        println("name: $name")
        println("livePlace: $livePlace")
        println("petName: $petName")

        if(petName!!.contains("cat")) {
            println("We have a program for your cat")
        }
    }
}