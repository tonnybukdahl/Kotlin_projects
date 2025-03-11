fun main() {
    // The well-known Hello World
    println("Hello World")

    /* Underneath here is the rest of the stuff I've done so far in Kotlin

    I will update as I progress
     */

    println("") // An extra line of space - I use this to separate output to the terminal
    println("My age is, at the time of writing:")
    print(2025 - 1980)

    // Different ways of declaring - or interring - variables

    var string1: String = "This is a String variable"
    println("")
    println("")
    println(string1)

    var string2: String
    string2 = "This is also a String variable"
    println(string2)

    var math1 = 10 - 1
    println("")
    println(math1)

    // This is also a variable but with a fixed value that NEVER changes

    val pi = 3.14
    println("This is the value of Pi:")
    println(pi)

    var valueOfPi: String
    valueOfPi = "This is ALSO the value of Pi:"
    val pi2 = 3.14
    println("")
    println(valueOfPi)
    println(pi2)

    // Forskellige typer af variabler

    var int1: Int = 10
    var double1: Double = 10.5
    var boolean1: Boolean = true

    println("")
    println(int1)
    println(double1)
    println(boolean1)


}