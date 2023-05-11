package chap03.selection3

fun main() {
    callByName(lambda)

}

fun callByName(b: () -> Boolean): Boolean {
    println("CallByName Function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("Lambda Function")
    true
}