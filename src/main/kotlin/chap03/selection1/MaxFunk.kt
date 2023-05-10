package chap03.selection1

fun main() {
    val num = 3
    val num2 = 10
    val result: Int

    result = max(num, num2)
    println(result)
}

fun max(a: Int, b: Int) = if (a > b) a else b
