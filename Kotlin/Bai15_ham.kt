fun tinhTong(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun xinChao(s: String) {
    if (s == "nam") println("Gioi tinh boy")
    else println("Gioi tinh girl")
}

fun main(args: Array<String>) {
    var a: Int? = readLine()?.toInt()
    var b: Int? = readLine()?.toInt()
    var c: Int? = readLine()?.toInt()
    if (a == null || b == null || c == null) return
    var tong: Int = tinhTong(a, b, c)
    println(tong)
    xinChao("nam")
}