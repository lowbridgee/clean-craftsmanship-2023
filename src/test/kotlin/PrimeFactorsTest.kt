package static

import factor.Factor
import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertSame

class PrimeFactorsTest {
    private val factor = Factor()
    @Test
    fun factorsOf() {
        assertEquals(ArrayList<Int>(), factor.factorsOf(1))
    }

    @Test
    fun factorsOf2() {
        assertEquals(arrayListOf(2), factor.factorsOf(2))
    }

    @Test
    fun factorsOf3() {
        assertEquals(arrayListOf(3), factor.factorsOf(3))
    }

    @Test
    fun factorsOf4() {
        assertEquals(arrayListOf(2,2), factor.factorsOf(4))
    }

    @Test
    fun factorsOf5() {
        assertEquals(arrayListOf(5), factor.factorsOf(5))
    }

    @Test
    fun factorsOf6() {
        assertEquals(arrayListOf(2,3), factor.factorsOf(6))
    }

    @Test
    fun factorsOf7() {
        assertEquals(arrayListOf(7), factor.factorsOf(7))
    }

    @Test
    fun factorsOf8() {
        assertEquals(arrayListOf(2,2,2), factor.factorsOf(8))
    }

    @Test
    fun factorsOf9() {
        assertEquals(arrayListOf(3,3), factor.factorsOf(9))
    }
}