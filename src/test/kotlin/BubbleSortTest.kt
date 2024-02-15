package static

import org.junit.jupiter.api.Test
import sort.BubbleSort
import kotlin.test.assertEquals

class BubbleSortTest {
    @Test
    fun nothing() {

    }

    @Test
    fun sorted() {
        assertEquals(listOf<Int>(1), BubbleSort.sort(listOf<Int>(1)))
    }

    @Test
    fun sorted2() {
        assertEquals(listOf<Int>(1,2), BubbleSort.sort(listOf<Int>(2,1)))
    }

    @Test
    fun sorted3() {
        assertEquals(listOf<Int>(1,2,3), BubbleSort.sort(listOf<Int>(2,1,3)))
    }

    @Test
    fun sorted4() {
        assertEquals(listOf<Int>(1,2,3), BubbleSort.sort(listOf<Int>(2,3,1)))
    }

    @Test
    fun sortMany() {
        assertEquals(listOf<Int>(1,1,2,3,3,3,4,5,5,5,6,7,8,9,9,9), BubbleSort.sort(listOf<Int>(3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3)))
    }
}