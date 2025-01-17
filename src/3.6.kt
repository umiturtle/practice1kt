fun main() {
    println("数値を入力してください。")
    val x = readln().toInt()
    if (oddJudgment(x)) {
        if (x >= 0) {
            println("この数は正の奇数です。")
        } else {
            println("この数は負の奇数です。")
        }
    } else {
        if (x >= 0) {
            println("この数は正の偶数です。")
        } else {
            println("この数は負の偶数です。")
        }
    }
}

fun
        oddJudgment(x: Int): Boolean {
    return if (x % 2 == 0) {
        (false)
    } else {
        (true)
    }
}