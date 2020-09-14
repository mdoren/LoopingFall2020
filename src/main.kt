fun main() {
    var userInput = 0

    do {
        print(
            """
        1. Super Strength
        2. Super Speed
        3. Flight
        4. Telekinesis
        5. Teleportation
        6. Invisibility
        7. Exit
        Enter the number of which superpower you want:
        """.trimIndent()
        )
        userInput = readLine()!!.toInt()
    } while (userInput == 0)

    if (userInput == 1)
        println("Dude, you're ripped")
    else if (userInput == 2)
        println("Hey can you head to the store real quick?")
    else if (userInput == 3)
        println("How's the weather up there?")
    else if (userInput == 4)
        println("Alright put me down!")
    else if (userInput == 5)
        println("Oh.. seeya..")
    else if (userInput == 6)
        println("Where'd you go?")
    else if (userInput > 7)
        println("Don't want powers? Alrighty.")
    (userInput == 0)
}