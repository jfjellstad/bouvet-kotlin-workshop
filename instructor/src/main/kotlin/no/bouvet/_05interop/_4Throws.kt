package no.bouvet._05interop

import java.io.*

//@Throws(IOException::class)
fun throwsException(value: String) {
    throw IOException("Java needs to know this")
}