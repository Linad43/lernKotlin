package forLes

const val PI = 3.14

fun main() {
    //ex1
    println("ex1")
    var a = (Math.random() * 200 - 100).toInt()
    var b = (Math.random() * 200 - 100).toInt()
    if (a < b) {
        val buf = a
        a = b
        b = buf
    }
    print("($a + $b) / 2 = ")
    var sred = 0.0
    var j = a
    for (i in b..a) {
        j--
        if (i == j) {
            sred = i.toDouble()
            break
        } else if (j < i) {
            sred = j + 0.5
            break
        }
    }
    println("$sred")

    //ex2
    println("ex2")
    var s = Math.random() * 100
    var d = Math.sqrt((s*4)/(PI))
    var l = PI*d
    println("S = $s; D = $d; L = $l")

    //ex3
    println("ex2")
    val x1 = (Math.random() * 200 - 100).toInt()
    val x2 = (Math.random() * 200 - 100).toInt()
    val y1 = (Math.random() * 200 - 100).toInt()
    val y2 = (Math.random() * 200 - 100).toInt()

    val perimetr = (Math.sqrt(Math.pow((x2-x1).toDouble(),2.0))+Math.sqrt(Math.pow((y2-y1).toDouble(),2.0)))*2
    val sqrt = (Math.sqrt(Math.pow((x2-x1).toDouble(),2.0))*Math.sqrt(Math.pow((y2-y1).toDouble(),2.0)))

    println("A($x1,$y1); B($x2,$y2)")
    println("perimetr = $perimetr")
    println("sqrt = $sqrt")

    //ex4
    println("ex4")
    var buf = 1
    for (i in 1..512){
        if (i%buf==0){
            buf=i
            print("$buf ")
        }
    }
    println()

    //ex5
    println("ex5")
    for (n in 20 downTo 0){
        if (n%2==0){
            print("$n ")
        }
    }
    println()
}