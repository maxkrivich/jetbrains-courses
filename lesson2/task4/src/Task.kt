class DateRange(val start: MyDate, val end: MyDate) {
    operator fun  iterator(): Iterator<MyDate> {
        return DateIterator(this)
    }
}

class DateIterator(val lastDate:DateRange): Iterator<MyDate>{
    var current:MyDate = lastDate.start

    override fun hasNext(): Boolean {
        return current <= lastDate.end
    }

    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }

}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}