/* Reading multiple data from the command line */

fun main(args: Array<String>){
    if(args.size == 0){
        println("Error: Please enter a set of arguments!")
    }else{
        for(name in args){
           println("Hello, $name !")
        }
    }
}