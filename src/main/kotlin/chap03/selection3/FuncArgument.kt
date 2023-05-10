package chap03.selection3

fun main() {
    val res1 = sum(3, 2)
    val res2 = mod(sum(3, 3), 3)

    println(res1)
    println(res2)
}

fun sum(a: Int, b: Int): Int = a + b

fun mod(a:Int, b: Int): Int = a * b