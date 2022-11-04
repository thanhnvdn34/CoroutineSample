//import kotlinx.coroutines.*
//import kotlin.concurrent.thread
//import kotlin.system.measureTimeMillis
//import kotlin.time.measureTime
//
//
////fun main() = runBlocking {
////    println("Main program starts: ${Thread.currentThread().name}")
////
////    val time = measureTimeMillis {
////        val msgOne = getMessageOne()
////        val msgTwo = getMessageTwo()
////        println("The entire msg: ${msgOne +  msgTwo}")
////    }
//////    val msgOne = getMessageOne()
//////    val msgTwo = getMessageTwo()
//////    println("The entire msg: ${msgOne +  msgTwo}")
////    println("Measure time: $time")
////
////    println("Main program end : ${Thread.currentThread().name}")
////fun main() = runBlocking {
////    println("Main program starts: ${Thread.currentThread().name}")
////
////    val time = measureTimeMillis {
////        val msgOne: Deferred <String> = async { getMessageOne() }
////        val msgTwo: Deferred <String> = async { getMessageTwo() }
//////        println("The entire msg: ${msgOne.await() + msgTwo.await()}")
////    }
////    println("Measure time: $time")
////
////    println("Main program end : ${Thread.currentThread().name}")
////}
//
////}
//
//
//fun main() = runBlocking {
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    val time = measureTimeMillis {
//        val msgOne: Deferred<String> = async(start = CoroutineStart.LAZY) { getMessageOne() }
//        val msgTwo: Deferred<String> = async(start = CoroutineStart.LAZY) { getMessageTwo() }
//        println("The entire msg: ${msgOne.await() + msgTwo.await()}")
//    }
//    println("Measure time: $time")
//
//    println("Main program end : ${Thread.currentThread().name}")
//
//
//}
//
//
//suspend fun getMessageOne(): String {
//    delay(1000)
//    println("getMessageOne")
//    return "Hello "
//}
//
//suspend fun getMessageTwo(): String {
//    delay(1000)
//    println("getMessageTwo")
//    return "World"
//}
//
//
//
