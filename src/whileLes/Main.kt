package whileLes

fun main() {

    //ex1
    println("\nex1")
    println("Введите число для подсчета факториала")
    var fact: Int;
    do {
        try {
            fact = readln().toInt()
        } catch (e: Exception) {
            continue
        }
        break
    } while (true)
    var result = 1
    var i = 1
    while (i <= fact) {
        result *= i++
    }
    println("$fact! = $result")

    //ex2
    println("\nex2")
    val price: Double = ((Math.random() * 10000).toInt()).toDouble() / 100
    println("$price - Цена за кг")
    i = 1
    while (i <= 10) {
        println("${i} кг = ${price * i++} у.е.")
    }

    //ex3
    println("\nex3")
    var a: Int
    var b: Int
    do {
        a = (Math.random() * 100).toInt()
        b = (Math.random() * 100).toInt()
    } while (a > b)
    i = 0
    println("A = $a, B = $b")
    while (a + i <= b) {
        if (i % 10 == 0 && i != 0) {
            print("\n%3d ".format(a + i))
        } else {
            print("%3d ".format(a + i))
        }
        i++
    }

    //ex4
    println("\nex4")
    var num:Int = (Math.random() * 1000000).toInt()
    println("$num")
    while (num>1){
        print("${num%10}; ")
        num/=10
    }

    //ex5
    println("\nex5")
    i=1
    while (i<20){
        if(i%2!=0){
        }else if (i%4==0){
            print("${i*2} ")
        }else if (i==19){
            break
        }else{
            print("$i ")
        }
        i++
    }

    //ex6
    println("\nex6")
    var sum:Double = 350.0
    var mounth = 9
    var procent:Double = 7.0
    i=0
    while (i<mounth){
        sum+=(((sum*(procent/100))*100).toInt()).toDouble()/100
        i++
        println("сумма после $i месяца: $sum")
    }
}