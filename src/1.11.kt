fun main () {
    val x = readln().toInt()
    val y = readln().toInt()
    if (x >= y){
        println(x/y)
        println(x%y)
    }
    else{
        println("error")
    }
}