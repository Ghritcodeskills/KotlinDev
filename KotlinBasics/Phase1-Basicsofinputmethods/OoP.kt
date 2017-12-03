/* Here we see the Object Oriented approach */

class Greet(val name:String){
    fun greet() {
        println("Hello, ${name} !")
    }
}

/* No 'new' keyword is used */

fun main(args: Array<String>){
    
    if(args.size == 0) println("Error: Enter a Command Line Argument!")
    
    else Greet(args[0]).greet()

}