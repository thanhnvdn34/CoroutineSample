
import kotlinx.coroutines.*
import kotlin.concurrent.thread

//
//fun main() {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    thread {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000)
//        println("Fake work end: ${Thread.currentThread().name}")
//    }
//
//    println("Main program end : ${Thread.currentThread().name}")
//}





///// Thread >< GlobalScope
//fun main() {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    GlobalScope.launch {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000)
//        println("Fake work end: ${Thread.currentThread().name}")
//    }
////    Thread.sleep(1000)
//
//    println("Main program end : ${Thread.currentThread().name}")
//}
////Back to slide

//// Suspending func
//fun main() {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    GlobalScope.launch {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        delay(1000)
//        println("Fake work end: ${Thread.currentThread().name}")
//    }
//    runBlocking {
////        delay(2000)
//    }
//    println("Main program end : ${Thread.currentThread().name}")
//}


//fun main() {
//
//    runBlocking {
//        println("Main program starts: ${Thread.currentThread().name}")
//
//        GlobalScope.launch {
//            println("Fake work starts: ${Thread.currentThread().name}")
//            delay(1000)
//            println("Fake work end: ${Thread.currentThread().name}")
//        }
//
//        delay(2000)
//
//        println("Main program end : ${Thread.currentThread().name}")
//    }
//
//}

//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    GlobalScope.launch {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        delay(1000)
//        println("Fake work end: ${Thread.currentThread().name}")
//    }
//
//    delay(2000)
//
//    println("Main program end : ${Thread.currentThread().name}")
//}

//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    launch {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        delay(1000)
//        println("Fake work end: ${Thread.currentThread().name}")
//    }
//
//    delay(2000)
//
//    println("Main program end : ${Thread.currentThread().name}")
//}


//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    val job : Job = launch {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        delay(1000)
//        println("Fake work end: ${Thread.currentThread().name}")
//    }
//
//    //job.cancel()
//    job.join()
//
//    println("Main program end : ${Thread.currentThread().name}")
//}


//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    val jobDeferred : Deferred<String> = async {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        delay(1000)
//        println("Fake work end: ${Thread.currentThread().name}")
//        "Tyson"
//    }
//
//    val value = jobDeferred.await()
//    println("value : $value")
//    jobDeferred.join()
//
//    println("Main program end : ${Thread.currentThread().name}")
//}


//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    val job: Job = launch {
//        for (i in 1..500) {
//            println(i)
//            Thread.sleep(100)
////            delay(50)
//        }
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
//        for (i in 1..500) {
//            if(!isActive) {
//                return@launch
//            }
//            println(i)
//            Thread.sleep(100)
////            delay(50)
//        }
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
