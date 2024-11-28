package no.bouvet._01types

class TwoNumbers1(val first: Int, val second: Int)
data class TwoNumbers2(val first: Int, val second: Int)

fun test1() {
    val p1 = TwoNumbers1(1, 3)
    val p2 = TwoNumbers1(1, 3)
    println(p1 == p2)
}

fun test2() {
    val p1 = TwoNumbers2(1, 3)
    val p2 = TwoNumbers2(1, 3)
    println(p1 == p2)
}

fun main() {
    test1()
    test2()
}
