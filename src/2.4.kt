fun main () {
    val x = readln().toInt()
    val y = readln().toInt()
    println(x+y)
    var sa = x-y
    sa = kotlin.math.abs(sa)
    println(sa)
    println(x*y)
    println("${x/y},${x%y}")
}