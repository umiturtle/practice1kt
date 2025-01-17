import kotlin.system.exitProcess

fun main() {
    println("ケースを選択してください。")
    println(
        "ケース1\n" +
                "    60 点以上：“合格”\n" +
                "    60 点未満：“不合格”\n" +
                "\n" +
                "ケース2\n" +
                "    80 点以上：“たいへんよくできました。”\n" +
                "    60 点以上、80 点未満：“よくできました。”\n" +
                "    60 点未満：“ざんねんでした。”\n" +
                "\n" +
                "ケース3\n" +
                "    80 点以上：“優”\n" +
                "    70 点以上、80 点未満：“良”\n" +
                "    60 点以上、70 点未満：“可”\n" +
                "    60 点未満：“不可”"
    )
    val case = readln().toInt()
    if (case != 1 && case != 2 && case != 3) {
        exitProcess(1)
    }
    println("点数を入力してください。")
    val x = readln().toInt()
    if (case == 1) {
        if (x >= 60) {
            println("合格")
        } else {
            println("不合格")
        }
    } else if (case == 2) {
        if (x >= 80) {
            println("大変よくできました。")
        } else if (x >= 60) {
            println("よくできました。")
        } else {
            println("はい、残念でした。")
        }
    } else {
        if (x >= 80) {
            println("優")
        } else if (x >= 70) {
            println("良")
        } else if (x >= 60) {
            println("可")
        } else {
            println("不可")
        }
    }
}