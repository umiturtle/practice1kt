fun main() {
    println("xを入力")
    val x = readln().toInt()
    println("yを入力")
    val y = readln().toInt()
    if (x > y) {
        println("xはyより大きい")
    } else if (x == y) {
        println("xはyと等しい")
    } else {
        println("xはyより小さい")
    }
}