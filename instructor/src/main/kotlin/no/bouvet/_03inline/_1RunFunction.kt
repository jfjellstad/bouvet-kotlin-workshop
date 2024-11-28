package no.bouvet._03inline

val foo = run {
    println("Calculating foo...")
    "foo"
}

fun main() {
    println(foo)
}