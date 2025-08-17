fun main(args: Array<String>) {
    var n: Int = 0
    var s: String? = readLine()
    if (s != null) n = s.toInt()
    for (i in 1..n) {
        for (j in 1..n) {
            if (j == 1 || j == n || i == j) print("*")
            else print(" ")
        }
        println()
    }
}