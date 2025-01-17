fun main() {
    println("中間テストの点数を入力してください。")
    val middle = readln().toInt()
    println("期末テストの点数を入力してください。")
    val final = readln().toInt()
    if ((middle >= 60 && final >= 60) || middle + final >= 130 || (middle + final >= 100 && (middle >= 90 || final >= 90))) {
        println("合格")
    } else {
        println("不合格")
    }
}