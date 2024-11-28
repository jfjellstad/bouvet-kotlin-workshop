package no.bouvet._03inline

val foo1 = run {
    println("Calculating the answer... (1)")
    42
}

val foo2: Int
    get() {
        println("Calculating the answer... (2)")
        return 42
    }

fun main() {
    println("foo1:")
    println(foo1)
    println(foo1)
    println("foo2:")
    println(foo2)
    println(foo2)
}