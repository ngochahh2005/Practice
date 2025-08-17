fun main(args: Array<String>) {
//    var n = 0
//    while (n < 100) {
//        n++
//        println("n in loop = $n")
//        if (n == 10) break
//    }

    //continue
    var s = 0
    for (i in 1..5) {
        if (i == 3) continue
        println(i)
        s += i
    }
    println("s = $s")
}