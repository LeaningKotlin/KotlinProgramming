package chap03.selection3

fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    println("CallByValue Function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda Function")
    true
}
