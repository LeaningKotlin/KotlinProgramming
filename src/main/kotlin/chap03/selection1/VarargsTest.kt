package chap03.selection1

fun main() {
    normalVarArgs(1, 2, 3, 4)
    normalVarArgs(4, 5, 6)
}

fun normalVarArgs(vararg count: Int) {
    count.forEach { args -> println(args) }
}