/* Reading a single data from the command line */
/* And no ';' */

fun main(args: Array<String>){
    if(args.size == 0){
        println(" Error:No Command line Argument was provided!")
        return
    }
    println(" Hello, ${args[0]}! ")
} 