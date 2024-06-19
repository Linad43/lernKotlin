package dataTypes

import java.util.Objects.toString
import javax.management.StringValueExp

/*
1. В методе main выполните следующие действия:
  - Объявите переменную с именем "age" типа Int и присвойте ей значение вашего возраста.
  - Объявите переменную с именем "name" типа String и присвойте ей значение вашего имени.
  - Объявите переменную с именем "isStudent" типа Boolean и присвойте ей значение true, если вы студент, и false в противном случае.
  - Объявите переменную с именем "salary" типа Double и присвойте ей значение вашего месячного дохода (можете выбрать любую сумму).
  - Выведите на экран значения всех объявленных переменных, разделяя их, например, символом " | ".
 */
fun main() {
    val age = 27;
    val name = "Daniil"
    val isStudent = false
    val salary = 61923.33
    println("Age: $age | Name: $name | isStudent: $isStudent | Salary: $salary")
}