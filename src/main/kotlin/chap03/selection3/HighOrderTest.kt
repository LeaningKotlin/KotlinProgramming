package chap03.selection3

fun main() {
    val result: Int

    // 일반 변수에 람다식 할당
    val muti = {a: Int, b: Int -> a * b}

    result = muti(10, 20)
    println(result)
}