package `when`

fun main() {

    //ex1
    val numMonth = (Math.random() * 12 + 1).toInt()
    print("$numMonth -> ")
    when (numMonth) {
        1 -> println("Январь")
        2 -> println("Февраль")
        3 -> println("Март")
        4 -> println("Апрель")
        5 -> println("Май")
        6 -> println("Июнь")
        7 -> println("Июль")
        8 -> println("Август")
        9 -> println("Сентябрь")
        10 -> println("Октябрь")
        11 -> println("Ноябрь")
        12 -> println("Декабрь")
        else -> println("Ошибка ввода")
    }

    //ex2
    val numDouble = Math.random()*10
    print("$numDouble -> ")
    when{
        (numDouble-numDouble.toInt()<0.5) -> println("${numDouble.toInt()}")
        else -> println("${numDouble.toInt()+1}")
    }

    //ex3
    val time = (Math.random()*24).toInt()
    print("$time -> ")
    when(time){
        in 0..5 -> println("Раннее утро")
        in 6..11 -> println("Утро")
        in 12..16 -> println("День")
        in 17..20 -> println("Вечер")
        in 20..23 -> println("Поздний вечер")
        else -> println("Ошибка")
    }

    //ex4
    var a = 8
    var b = 5
    println("a = $a, b = $b")
    var buf = a
    a = b
    b = buf
    println("a = $a, b = $b")
}