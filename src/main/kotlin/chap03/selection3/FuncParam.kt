package chap03.selection3

fun main() {
    funcParam(3, 2, ::sum)
}

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}