/* val is a read only local variable, which is assigned a pattern matching expression */

fun main(args: Array<String>) {
    val language = if (args.size == 0) "EN" else args[0]
    println( when (language){
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        "HI" -> "Namaste!"
        else -> "Sorry, I can't greet you in $language yet!"
    })
}