fun main(args: Array<String>){
    var counter = 10 //Initialize it

    while(counter < 10){
        println("First Loop - The counter is $counter")
        counter++ //counter = counter + 1
    }
     counter = 10
    do {
        println("Second Loop - The counter is $counter")
        counter++ //counter = counter + 1
    } while(counter < 10)
}
