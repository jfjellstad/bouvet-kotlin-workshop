package no.bouvet._04conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

class DateRange(val start: MyDate, val endInclusive: MyDate)

operator fun MyDate.rangeTo(other: MyDate): DateRange = TODO()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}
