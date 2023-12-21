package static

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import stack.Stack
import stack.UnderflowException
import kotlin.test.assertSame

class StackTest {
    private val stack = Stack()
    @Test
    fun canCreateStack() {
        assertSame(true, stack.isEmpty())
    }

    @Test
    fun Stackに一要素をpushしたあとはStackは空ではない() {
        stack.push(0)
        assertSame(false, stack.isEmpty())
        assertSame(1, stack.getSize())
    }

    @Test
    fun Stackに一要素をpushしたのちにpopを行ったらStackは空になる() {
        stack.push(0)
        stack.pop()
        assertSame(true, stack.isEmpty())
        assertSame(0, stack.getSize())
    }

    @Test
    fun Stackに2回pushしたらStackサイズは2() {
        stack.push(0)
        stack.push(0)
        assertSame(2, stack.getSize())
    }

    @Test
    fun 空のStackからpopしたらアンダーフロー例外を吐く() {
        assertThrows<UnderflowException> {
            stack.pop()
        }
    }
}
