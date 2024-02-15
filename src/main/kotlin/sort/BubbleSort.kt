package sort

object BubbleSort {
    fun sort(list: List<Int>): List<Int>{
        var result = list.toMutableList()
        if (result.size > 1) {
            for(limit in result.size-1 downTo 1) {
                for(firstIndex in 0 until limit) {
                    var secondIndex = firstIndex + 1
                    if (result[firstIndex] > result[secondIndex]) {
                        var first = result[firstIndex]
                        var second = result[secondIndex]
                        result[firstIndex] = second
                        result[secondIndex] = first
                    }
                }
            }
        }
        return result
    }
}