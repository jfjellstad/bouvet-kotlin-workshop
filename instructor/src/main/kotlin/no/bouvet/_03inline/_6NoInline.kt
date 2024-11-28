package no.bouvet._03inline


// adding inline below changes things
// add params noinline
inline fun operation(x: Int, y: Int, noinline func: (Int, Int) -> Int) {
    println("Function being called")
    func(x, y)
    println("Function was called")

}