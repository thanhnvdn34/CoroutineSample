import kotlinx.coroutines.*
import kotlin.concurrent.thread



//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    val job: Job = launch {
//        for (i in 1..500) {
//            print("$i .")
////            Thread.sleep(100)
////            delay(50)
//        }
//    }
//
////    delay(1000)
//
////    job.cancel()
////    job.join()
//
//    println("Main program end : ${Thread.currentThread().name}")
//}

//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    val job: Job = launch(Dispatchers.Default) {
//        for (i in 1..500) {
//            if(!isActive) {
//                return@launch
//            }
//            println(i)
//            delay(1)
//        }
//    }
//
//    delay(10)
//
//    job.cancel()
//    job.join()
//
//    println("Main program end : ${Thread.currentThread().name}")
//}

//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    val job: Job = launch(Dispatchers.Default) {
//        try {
//            for (i in 1..500) {
//                println(i)
//                delay(5)
//            }
//        } catch (ex: CancellationException) {
//            println("CancellationException Safety")
//        } finally {
//            println("Close Exception")
//        }
//
//    }
//
//    delay(1000)
//
//    job.cancel()
//    job.join()
//
//    println("Main program end : ${Thread.currentThread().name}")
//}

//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    val job: Job = launch(Dispatchers.Default) {
//        try {
//            for (i in 1..500) {
//                println(i)
//                delay(5)
//            }
//        } catch (ex: CancellationException) {
//            println("CancellationException Safety")
//        } finally {
//            withContext(NonCancellable) {
//                delay(1000)
//                println("Close Exception")
//            }
//        }
//
//    }
//
//    delay(1000)
//
//    job.cancel()
//    job.join()
//
//    println("Main program end : ${Thread.currentThread().name}")
//}


//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    val job: Job = launch(Dispatchers.Default) {
//        try {
//            for (i in 1..500) {
//                println(i)
//                delay(5)
//            }
//        } catch (ex: CancellationException) {
//            println("CancellationException Safety with msg: ${ex.message}")
//        } finally {
//            withContext(NonCancellable) {
//                delay(1000)
//                println("Close Exception")
//            }
//        }
//
//    }
//
//    delay(1000)
//
//    job.cancel(CancellationException("Failure"))
//    job.join()
//
//    println("Main program end : ${Thread.currentThread().name}")
//}

//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    withTimeout(100) {
//        try {
//            for (i in 1..500) {
//                println(i)
//                delay(5)
//            }
//        } catch (ex: CancellationException) {
//            println("CancellationException Safety with msg: ${ex.message}")
//        } finally {
//            withContext(NonCancellable) {
//                delay(1000)
//                println("Close Exception")
//            }
//        }
//
//    }
//
//
//    println("Main program end : ${Thread.currentThread().name}")
//}