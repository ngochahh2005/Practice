/*
   Viết chương trình nhập vào 1 list
    #1. In ra có bao nhiêu số nhỏ hơn 5
    #2. Và in ra vị trí index các số đó
 */
fun main(args: Array<String>) {
    var ip: String? = readLine()
    if (ip == null) return
    var n: Int = ip.toInt()
    var l: MutableList<Int> = mutableListOf()
    var cnt: Int = 0
    for (i in 0 until n) {
        ip = readLine()
        if (ip == null) return
        l.add(ip.toInt())
        if (l[i] < 5) cnt++
    }
    println(cnt)
    for (i in l.indices) {
        if (l[i] < 5) print("$i\t")
    }
}