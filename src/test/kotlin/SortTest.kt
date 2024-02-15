package static

import org.junit.jupiter.api.Test
import sort.Sort
import kotlin.test.assertEquals

class SortTest {
    @Test
    fun testSort() {
        assertEquals(listOf(), Sort.sort(listOf()))
        assertEquals(listOf(1), Sort.sort(listOf(1)))
        assertEquals(listOf(1,2), Sort.sort(listOf(1,2)))
    }

    @Test
    fun sort2() {
        assertEquals(listOf(1,2), Sort.sort(listOf(2,1)))
    }

    @Test
    fun sort3() {
        assertEquals(listOf(1,2,3), Sort.sort(listOf(1,2,3)))
    }
}