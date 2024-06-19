package operators

const val PI = 3.14

fun main() {
    val a = 2
    val b = 3
    val perimetr = a * 4;
    val areaSquare = a*a
    val areaRect = a * b
    val d = 4
    val length = PI * d
    val lsm = 285//см
    val lm = lsm / 100
    val otrA = 993
    val otrB = 12
    val countOtrBInA = otrA % otrB
    println("ex1:\na = $a\nP = $perimetr")
    println("ex2:\na = $a\nS = $areaSquare")
    println("ex3:\na = $a b = $b\nS = $areaRect")
    println("ex4:\nd = $d\nL = $length")
    println("ex5:\nL in santimetr = $lsm\nL in metr = $lm")
    println("ex6:\notrezok A = $otrA otrezok B = $otrB\nB in A = $countOtrBInA")
}
