//int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。

fun main() {
    println("Please enter the number x")
    val x = readln().toInt()
    println("Please enter the number y")
    val y = readln().toInt()
    if (x > y) {
        println("x is larger than y")
    }
}