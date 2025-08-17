fun main(args: Array<String>) {
    var a: Int = 0
    var b: Int = 0
    println("Nhap chieu dai: ")
    var h: String? = readLine()
    if (h != null) a = h.toInt()

    println("Nhap chieu rong: ")
    var w: String? = readLine()
    if (w != null) b = w.toInt()

    println("Dien tich S = " + (a * b))
    println("Chu vi P = " + (2 * (a + b)))
}