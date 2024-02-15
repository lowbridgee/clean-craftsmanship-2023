package sort

object Sort {
    fun sort(list: List<Int>): List<Int> {
        if (list.size <= 1) {
            return list
        } else if (list.size == 2) {
            val first = list[0]
            val second = list[1]
            if (first > second) {
                return listOf(second, first)
            } else {
                return listOf(first, second)
            }
        } else {
            return list
        }
    }
}