fun main(args: Array<String>) {
    var n: Int = 0
    var s: String? = readLine()
    if (s != null) n = s.toInt()
//    when (n) {
//        1 -> println("Ban bam so 1")
//        2 -> println("Ban bam so 2")
//        3 -> println("Ban bam so 3")
//        else -> println("Khong hop le")
//    }

//    when (n % 2) {
//        0 -> println("So chan")
//        else -> println("So le")
//    }

    // n = thang
//    when (n) {
//        1, 2, 3 -> println("Quy 1")
//        4, 5, 6 -> println("Quy 2")
//        7, 8, 9 -> println("Quy 3")
//        10, 11, 12 -> println("Quy 4")
//        else -> println("Khong hop le")
//    }

    // 1 vung du lieu, n = thu nhap/thang
//    when (n) {
//        in 1..3 -> println("Ban ngheo kiet xac")
//        in 4..7 -> println("Ban ngheo vua vua")
//        in 8..19 -> println("Ban thu nhap kha")
//        in 20..50 -> println("Ban thu nhap cao")
//        in 51..1000 -> println("Ban la dai gia")
//        else -> println("Boc phet")
//    }

    //dung when nhu 1 bieu thuc tra ve ket qua
//    var check = when (n) {
//        in 0..100 -> false
//        else -> true
//    }
//    println(check)

    //dung nhu if - else
    when {
        n % 2 == 0 -> println("$n la so chan")
        else -> println("$n la so le")
    }
}