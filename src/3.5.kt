fun main() {
    println("整数を入力してください")
    val x = readln().toInt()
    if (x % 2 == 1) {
        println("xは奇数です。")
    } else {
        println("xは偶数です。")
    }
}