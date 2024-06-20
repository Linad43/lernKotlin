package complexHW

fun main() {
    //ex1
    println("ex1")
    var n = (Math.random() * 100 + 1).toInt()
    var sum = 0.0
    for (i in 1..n) {
        sum += (1 / i.toDouble())
    }
    println("n = $n; sum = $sum")

    //ex2
    println("ex2")
    var a = (Math.random() * 10).toInt()
    var b = (Math.random() * 10).toInt()
    sum = 0.0
    if (a > b) {
        val buf = a
        a = b
        b = buf
    }
    for (i in a..b) {
        sum += i * i
    }
    println("sum($a, $b) = $sum")

    //ex3
    println("ex3")
    a = (Math.random() * 10).toInt()
    b = (Math.random() * 10).toInt()
    if (a > b) {
        val buf = a
        a = b
        b = buf
    }
    println("a = $a, b = $b")
    for (i in a..b) {
        repeat(i - a + 1) {
            print("$i, ")
        }
    }
    println()

    //ex4
    println("ex4")
    n = (Math.random() * 998 + 2).toInt()
    var flag = true
    for (i in (n / 2) downTo 2) {
        if (n % i == 0) {
            flag = false
            break
        }
    }
    println("Число $n простое? $flag")

    //ex5
    var result: String
    for (i in 1..3) {
        println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
        when (i) {
            1 -> println("Первая попытка: ")
            2 -> println("Вторая попытка: ")
            3 -> println("Последняя попытка: ")
        }
        result = readln()
        result = result.lowercase()
        when (result) {
            "троллейбус" -> {
                println("Правильно!")
                break
            }

            "сдаюсь" -> {
                println("Правильный ответ: троллейбус.")
                break
            }

            else -> {
                if (i != 3) {
                    println("Попробуйте еще")
                }
            }
        }
        if (i == 3) {
            println("Попытки закончились. Правильный ответ: троллейбус.")
        }
    }
}