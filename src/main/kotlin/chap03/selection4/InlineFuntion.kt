package chap03.selection4

fun main() {
    shortFunc(3){ println("First Call $it")}
    shortFunc(5){ println("Second Call $it")}
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before Calling out()")
    out(a)
    println("After Calling out()")
}