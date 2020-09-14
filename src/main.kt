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
        if (userInput == 1)
            println("Dude, you're ripped\n")
        else if (userInput == 2)
            println("Hey can you head to the store real quick?\n")
        else if (userInput == 3)
            println("How's the weather up there?\n")
        else if (userInput == 4)
            println("Alright put me down!\n")
        else if (userInput == 5)
            println("Oh.. seeya..\n")
        else if (userInput == 6)
            println("Where'd you go?\n")
        else
            println("Don't want powers? Alrighty.\n")
        (userInput - userInput)
    } while (userInput != 1 or 2 or 3 or 4 or 5 or 6 or 7)
    //I wanted this to not re-display the menu when you input 1..7 but it seems to do that anyways.
}
