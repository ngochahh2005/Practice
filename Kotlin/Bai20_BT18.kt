/*
    Cho:
    var str1: String = "English = 78 Science = 83 Maths = 68 History = 65"
    1. Tinh tong cac so trong chuoi tren
    2. Tinh trung binh cong
 */
fun main(args: Array<String>) {
    var s: String = "English = 78 Science = 83 Maths = 68 History = 65"
    var n: Int = 0
    var sum: Int = 0
    for (i in 0 until s.length) {
        if (s[i].isDigit())
            n = n * 10 + (s[i] - '0')
        else {
            sum += n
            n = 0
        }
    }
    sum += n
    println(sum)
}