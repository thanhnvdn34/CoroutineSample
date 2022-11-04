import kotlinx.coroutines.*
import kotlin.concurrent.thread



//fun main(): Unit = runBlocking {
//
//
//    println("runBlocking: $this")
//
//    launch {
//        println("launch: $this")
//        launch {
//            println("child launch: $this")
//        }
//    }
//
//    async {
//        println("async: $this")
//    }
//
//
//}


fun main(): Unit = runBlocking {


    /* Without Parameter CONFINED
        - Inherit CoroutineContext from immediate parent coroutine
        - Even after delay() orr suspending function, it continues to run the same Thread
    * */
    launch {
        println("C1: ${Thread.currentThread().name}")
        delay(1000)
        println("C1 after dela: ${Thread.currentThread().name}")
    }

    /* With Parameter: Dispatcher.Default
            - Gets it own context at Gobal level. Executes in a separate background thread
            - Even after delay() orr suspending function,
                it continues to run either the same Thread or some other thread
        * */
    launch(Dispatchers.Default) {
        println("C2: ${Thread.currentThread().name}")
        delay(1000)
        println("C2 after delay: ${Thread.currentThread().name}")
    }

    /* With Parameter: Dispatcher.Unconfined
            - Inherit CoroutineContext from immediate parent coroutine
            - Even after delay() orr suspending function,
                it continues to run in some other thread
        * */
    launch(Dispatchers.Unconfined) {
        println("C3: ${Thread.currentThread().name}")
        delay(1000)
        println("C3 after delay: ${Thread.currentThread().name}")
    }


}