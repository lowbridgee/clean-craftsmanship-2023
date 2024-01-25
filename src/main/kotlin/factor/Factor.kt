package factor

class Factor {
    fun factorsOf(n: Int): ArrayList<Int> {
        var num = n
        var factors = ArrayList<Int>()
        var divisor = 2
        while (num > 1) {
            while (num % divisor == 0) {
                factors.add(divisor)
                num /= divisor
            }
            divisor++
        }
        return factors
    }
}