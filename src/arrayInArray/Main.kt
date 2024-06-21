package arrayInArray


fun main() {
    println("ex1")
    var matrix = arrayOf(
        arrayOf(3, 2, 2),
        arrayOf(4, 1, 8),
        arrayOf(5, 6, 2)
    )
    var min = matrix[0][0]
    var x = 0
    var y = 0
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] < min) {
                min = matrix[i][j]
                x = i
                y = j
            }
        }
    }
    println(matrix.contentDeepToString())
    println("Минимальный элемент в матрице $min [${x + 1};${y + 1}]")

    println("ex2")
    var matrix2 = arrayOf(
        arrayOf(3, 2, 2),
        arrayOf(4, 1, 8),
        arrayOf(5, 6, 2),
        arrayOf(7, 1, 9),
        arrayOf(0, 1, 8)
    )
    println(matrix2.contentDeepToString())
    var sum = 0
    for (i in matrix2.indices) {
        for (j in matrix2[i].indices) {
            sum += matrix2[i][j]
        }
    }
    var mediana = sum / ((matrix2.lastIndex + 1) * (matrix2[matrix2.lastIndex].lastIndex + 1))
    println("Среднее значение матрицы $mediana")

    println("ex3")
    var k = 0
    var matrix3 = Array(5) { Array(5) { 0 } }
    println(matrix3.contentDeepToString())
    for (i in (matrix3.size - 1) downTo 0) {
        if (k < (matrix3[i].size / 2) + 1) {
            for (j in (matrix3[i].size - k) - 1 downTo (0 + k)) {
                matrix3[i][j] = 1
            }
        }
        k++
    }
    println(matrix3.contentDeepToString())

    println("ex4")
    var max1 = matrix[0][0]
    var max2 = matrix[0][0]
    for (array in matrix) {
        for (element in array) {
            if (element > max1) {
                max2 = max1
                max1 = element
            }else if (element>max2){
                max2=element
            }
        }
    }
    println("max1 = $max1; max2 = $max2")
}