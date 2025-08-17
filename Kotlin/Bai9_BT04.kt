fun main(args: Array<String>) {
    var tong: Int = 0
    var hieu: Int = 0
    var s1: String? = readLine()
    if (s1 != null) tong = s1.toInt()
    var s2: String? = readLine()
    if (s2 != null) hieu = s2.toInt()
    var x: Int = (tong + hieu)/2
    var y: Int = tong - x
    println("x = $x")
    println("y = $y")
}