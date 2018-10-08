import kotlinx.coroutines.experimental.coroutineScope
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

object ScopeTest {

    @JvmStatic
    fun main(args: Array<String>) = runBlocking {

        launch {
            delay(200L)
            println("Task from runBlocking")
        }

        coroutineScope {
            launch {
                delay(2500L)
                println("Task from nested launch")
            }

            delay(100L)
            println("Task from coroutine scope")
        }

        println("Coroutine scope is over")

    }
}
