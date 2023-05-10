package chap03.selection1

fun main() {
    val name: String = "홍길동"
    val email: String = "gildong@example.com"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.com")
    defaultArgs()
    defaultArgs(200)
}

fun add(name: String, email: String = "default") {
    println("${name}님의 이메일은 ${email}입니다.")
}

fun defaultArgs(x: Int = 100, y: Int = 120) = println(x + y)
