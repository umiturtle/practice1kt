fun main () {
    var x = 3
    var y = 7
//ここから入れ替え
    val a = x
    x = y
    y = a
    println("x=$x,y=$y")
}