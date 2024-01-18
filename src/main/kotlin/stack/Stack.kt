package stack
class Stack {
    private var empty = true
    private var size = 0
    private var elements: MutableList<Number> = mutableListOf()

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun push(element: Number) {
        size++
        this.elements.add(element)
    }

    fun pop(): Number {
        if (size == 0) {
            throw UnderflowException()
        }
        val num = this.elements[size - 1]
        this.elements.removeAt(size - 1)
        size--
        return num
    }

    fun getSize(): Number {
        return size
    }
}

class UnderflowException : RuntimeException() {

}
