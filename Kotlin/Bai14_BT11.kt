fun main(args: Array<String>) {
    var a: Int = 0
    println("Nhập a = ")
    var s: String? = readLine()
    if (s != null) a = s.toInt()
    if (a % 2 == 0) {
        var sum = 0
        for (i in 0..a step 2) {
            sum += i
        }
        println("Tổng các số chẵn từ 0->$a la: $sum")
    } else {
        println("Tôi không tính tổng số lẻ, bye bye")
    }
}