fun main(){
    var userAns = 0

    do{
        println("1. Mario")
        println("2. Donkey Kong")
        println("3. Link")
        println("4. Samus")
        println("5. Yoshi")
        print("Enter Choice: ")
        userAns = readLine()!!.toInt()
    } while (userAns !=9)
}