fun main(args: Array<String>) {
//    var i = 0
//    while (i <= 5) {
//        println(i)
//        i++
//    }
//    println("Vong while da xong, i = $i")

    //Nhap n. Yeu cau 1 <= n <= 99. Nhap sai -> nhap lai
//    var n: Int = 0
//    while (n < 1 || n > 99) {
//        println("Nhap n (tu 1->99): ")
//        var s: String? = readLine()
//        if (s != null) n = s.toInt()
//    }

    //tinh tong 1->5
//    var i = 1
//    var s = 0
//    do {
//        s += i++
//    } while (i <= 5)
//    println(s)

    while (true) {
        println("Bạn có muốn thoát chương trình không? (Bấm y để thoát)")
        var s: String? = readLine()
        if (s == "Y" || s == "y") break
    }
    println("Thank you!")
}