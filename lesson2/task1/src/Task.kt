data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (this.year > other.year)
            return 1
        else if (this.year < other.year)
            return -1
        else {
            if (this.month > other.month)
                return 1
            else if (this.month < other.month)
                return -1
            else {
                if (this.dayOfMonth > other.dayOfMonth)
                    return 1
                else if (this.dayOfMonth > other.dayOfMonth)
                    return -1
                else
                    return 0
            }
        }
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2