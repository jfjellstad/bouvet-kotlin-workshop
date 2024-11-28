package no.bouvet._01types

class Service {
    fun doit(person: Person) {
        println(person)
    }
}

sealed interface Person {
    val bracket: AgeBracket
}

@JvmRecord
data class Citizen(
    val name: String,
    val age: Int,
) : Person {
    override val bracket: AgeBracket
        get() = Util.calcBracket(age)
}

data object Employee: Person {
    override val bracket: AgeBracket
        get() = AgeBracket.ADULT
}


object Util {
    fun calcBracket(age: Int): AgeBracket {
        return with(age) {
            when {
                age in (0..1) -> AgeBracket.INFANT
                age in (2 .. 18) -> AgeBracket.CHILD
                age in (19 .. 74) -> AgeBracket.ADULT
                age > 75 -> AgeBracket.RETIREE
                else -> AgeBracket.UNKNOWN
            }
        }
    }
}

enum class AgeBracket {
    INFANT,
    CHILD,
    ADULT,
    RETIREE,
    UNKNOWN;
}

@JvmInline
value class EmployeeBadge(val badge: String)

fun main() {
    val john = Citizen("john", 50)
    println("${john}: ${john.bracket}")

//    val (name, age) = john
//    println("name: $name, age: $age")

//    val siri = Employee
//    println(siri.bracket)
}