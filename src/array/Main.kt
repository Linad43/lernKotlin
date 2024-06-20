package array


fun main() {
    println("ex1")
    var array = DoubleArray(10)
    for (index in array.indices) {
        array[index] = Math.random() * 10
    }
    println(array.contentToString())
    var mul = 1.0
    for (element in array) {
        mul *= element
    }
    println("mul = $mul")

    println("ex2")
    var array1 = DoubleArray(8)
    for (index in array1.indices) {
        array1[index] = Math.random() * 10
    }
    println(array1.contentToString())
    println("Среднее значение: ${array1.average()}")

    println("ex3")
    var size = (Math.random()*20+5).toInt()
    var array2 = IntArray(size)
    var k = 0
    for (index in array2.indices) {
        array2[index] = (Math.random() * 10).toInt()
    }
    println(array2.contentToString())
    for (element in array2){
        if (element%2==0){
            k++
            print("$element ")
        }
    }
    println("\nK = $k")

    println("ex4")
    var n = (Math.random() * 10 + 1).toInt()
    var array3 = IntArray(n)
    for (i in 0..(n-1)){
        array3[i] = Math.pow(2.0, 1.0+i.toDouble()).toInt()
    }
    println("N = $n")
    println(array3.contentToString())
}