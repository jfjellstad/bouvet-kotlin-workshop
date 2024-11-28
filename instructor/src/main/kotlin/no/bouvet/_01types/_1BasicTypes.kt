package no.bouvet._01types

//  Kotlin              |   Java
val oneByte: Byte = 1    // byte/Byte
val oneShort: Short = 1  // short/Short
val oneInt: Int = 1      // int/Integer
val oneLong: Long = 1L   // long/Long
val oneDouble: Double = 1.0 // double/Double
val oneFloat: Float = 1.0f  // float/Float

fun main() {
    fun printDouble(d: Double) { println(d) }

    printDouble(oneDouble)

//    printDouble(oneInt) // Error: Type mismatch
//    printDouble(oneFloat) // Error: Type mismatch
}
