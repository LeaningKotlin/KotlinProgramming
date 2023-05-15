package chap03.selection3

fun main() {
    // 매개변수 없는 람다식 함수
    noParam ({ "Hello World!" })
    noParam { "Hello World!" }

    // 매개변수가 하나 있는 함다식 함수
    oneParam ({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" } // 위와 동일 결과, 소괄호 생략 가능
    oneParam { "Hello World! $it" }     // 위와 동일 결과, it으로 대체 가능

    // 매개변수가 두 개 있는 람다식 함수
    moreParam { a, b -> "Hello World! $a $b" }  // 매개변수명 생략 불가
    moreParam { _, b -> "Hello World! $b" }     // 첫 번째 문자열은 사용하지 않고 생략
}

// 매개변수가 없는 람다식 함수가 noParam 함수의 매개변수 out 으로 지정되
fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}