package static

import bowling.Game
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BowlingTest {
    private val g = Game()

    @Test
    fun canRoll() {
        g.roll(0)
    }

    @Test
    fun gutterGame() {
        rollMany(20, 0)
        assertEquals(0, g.score())
    }

    @Test
    fun allOnes() {
        rollMany(20, 1)
        assertEquals(20, g.score())
    }

    @Test
    fun oneSpare() {
        rollSpare()
        g.roll(7)
        rollMany(17, 0)
        assertEquals(24, g.score())
    }

    @Test
    fun oneStrike() {
        g.roll(10)
        g.roll(2)
        g.roll(3)
        rollMany(16, 0)
        assertEquals(20, g.score())
    }

    @Test
    fun perfectGame() {
        rollMany(12,10)
        assertEquals(300, g.score())
    }

    private fun rollMany(n: Int, pins: Int) {
        for (i in 1..n) {
            g.roll(pins)
        }
    }

    private fun rollSpare() {
        rollMany(2,5)
    }
}