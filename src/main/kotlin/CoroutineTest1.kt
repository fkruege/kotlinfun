import kotlinx.coroutines.experimental.GlobalScope
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

object CoroutineTest1 {

    @JvmStatic
    fun main(args: Array<String>) {
        runBlocking {
            launch {
                delay(1000L)
                println("World")
            }
            println("Hello, ")
        }

    }

}

