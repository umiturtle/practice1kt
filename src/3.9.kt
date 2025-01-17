fun main () {
    println("日程、時間を選択してください。")
    println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜")
    val date = readln().toInt()
    println("0=午前、1=午後、2=夜間")
    val time = readln().toInt()
    if(date<0||date>6||time<0||time>2){
        error("不正値が混入しています。")
    }
    if (time==0){
        if (date==1||date==3||date==4||date==6){
            println("開館しています。")
        }else{
            println("閉館しています。")
        }
    }else if (time==1){
        if (date==1||date==2||date==3||date==4||date==5){
            println("開館しています。")
        }else{
            println("閉館しています。")
        }
    }else{
        if (date==1||date==2||date==4||date==5){
            println("開館しています。")
        }else{
            println("閉館しています。")
        }
    }
}