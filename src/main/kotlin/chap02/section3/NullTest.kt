package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    var int: Int? = null    // null을 허용

//    str1 = null

    println("str1: $str1")
    println("str1: $str1 length: ${str1?.length}") // 세이프 콜
    println("str1: $str1 length: ${str1!!.length}") // non null 단정 기호

    val len = if(str1 != null) str1.length else -1
    println("str1: $str1 length: $len")

    println("str1: $str1 length: ${str1?.length ?: -1}")    // 세이프콜과 엘비스 연산지
}