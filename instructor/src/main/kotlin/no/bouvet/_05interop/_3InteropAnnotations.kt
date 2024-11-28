@file:JvmName("Foo")
package no.bouvet._05interop


class Employee {
    // @JvmField will make this a field and eliminate property accessors
    var field = ""
}

fun process(input: List<Int>) {

}

@JvmName("processStrings")
fun process(input: List<String>) {

}


// Others: @JvmStatic, @JvmOverload, etc. See https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/index.html