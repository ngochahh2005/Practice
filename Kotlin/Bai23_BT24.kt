import kotlin.random.Random

/*
    Viết chương trình tạo ra 1 list có n phần tử, n nhập từ bàn phím
    Các phần tử là số ngẫu nhiên từ 1 -> 100
 */
fun main(args: Array<String>) {
    var n: Int
    var ip: String? = readLine()
    if (ip == null) return
    n = ip.toInt()
    var l: MutableList<Int> = mutableListOf()
    var rd = Random
    for (i in 0 until n) {
        l.add(rd.nextInt(1, 101))
    }
    println(l)
}