package ifing

fun main() {
    println("ex1")
    var num = (Math.random() * 20 - 10).toInt()
    println("num = $num")
    if (num >= 0) {
        num++
    }
    println("num = $num")

    println("ex2")
    val x1 = 4
    val x2 = 45
    val x3 = -3
    val x4 = 8
    var count = 0
    if (x1 > 0) count++
    if (x2 > 0) count++
    if (x3 > 0) count++
    if (x4 > 0) count++
    println("count = $count")

    println("ex3")
    val a = (Math.random() * 20 - 10).toInt()
    val b = (Math.random() * 20 - 10).toInt()
    if (a > b) println("a = $a > b = $b")
    else println("a = $a <= b = $b")

    println("ex4")
    val week = (Math.random() * 7 + 1).toInt()
    if (week == 1) println("понедельник")
    else if (week == 2) println("вторник")
    else if (week == 3) println("среда")
    else if (week == 4) println("четверг")
    else if (week == 5) println("пятница")
    else if (week == 6) println("суббота")
    else if (week == 7) println("воскресенье")

    println("ex5")
    val score = (Math.random() * 5 + 1).toInt()
    if (score == 1) println("плохо")
    else if (score == 2) println("неудовлетворительно")
    else if (score == 3) println("удовлетворительно")
    else if (score == 4) println("хорошо")
    else if (score == 5) println("отлично")

    println("ex6")
    val x = (Math.random() * 20 - 10)
    var y = (Math.random() * 20 - 10)
    while (y == 0.0) {
        y = (Math.random() * 20 - 10)
    }
    val operation = (Math.random() * 4 + 1).toInt()
    if (operation == 1) println("$x + $y = " + (x + y))
    else if (operation == 2) println("$x - $y = " + (x - y))
    else if (operation == 3) println("$x * $y = " + (x * y))
    else if (operation == 4) println("$x / $y = " + (x / y))
}