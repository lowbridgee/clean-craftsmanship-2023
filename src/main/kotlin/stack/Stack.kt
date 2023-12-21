package stack
class Stack {
    private var empty = true
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun push(number: Number) {
        size++
    }

    fun pop(): Int {
        if (size == 0) {
            throw UnderflowException()
        }
        --size
        return -1
    }

    fun getSize(): Int {
        return size
    }
}

class UnderflowException : RuntimeException() {

}
