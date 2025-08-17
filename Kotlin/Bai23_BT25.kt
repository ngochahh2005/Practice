/*
    Viết chương trình nhập vào 1 list sau đó:
    #1. Tạo ra 1 list mới bình phương các phần tử
    #2. Xác định bao nhiêu phần tử lớn hơn 50
 */
fun main(args: Array<String>) {
    var ip: String? = readLine()
    if (ip == null) return
    var n: Int = ip.toInt()
    var l: MutableList<Int> = mutableListOf()
    var l2: MutableList<Int> = mutableListOf()
    for (i in 0 until n) {
        ip = readLine()
        if (ip == null) return
        l.add(ip.toInt())
        l2.add(l[i]*l[i])
    }
    var l3 = l.filter { x -> x>50 }
    println(l2)
    println(l3.size)
}