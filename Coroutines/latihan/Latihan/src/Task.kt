import kotlinx.coroutines.*

// TODO 1
fun sum(valueA: Int, valueB: Int): Int {
    runBlocking {
        launch {
            delay(3000)
        }
    }
    return valueA + valueB
}

// TODO 2
fun multiple(valueA: Int, valueB: Int): Int {
    runBlocking {
        launch {
            delay(2000)
        }
    }
    return valueA * valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3
    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")
}