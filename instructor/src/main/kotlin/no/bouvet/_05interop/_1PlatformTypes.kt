package no.bouvet._05interop

fun main() {
    explicitNullableType()
    explicitNotNullType()
    noExplicitType()
}

fun noExplicitType() {
    val session = Session()
    val description = session.description
    println(description.length) // NPE
}

fun explicitNotNullType() {
    val session = Session()
    val description: String = session.description // IllegalStateException
    println(description.length)

}

fun explicitNullableType() {
    val session = Session()
    val description: String? = session.description // ok
    println(description?.length) // null
}