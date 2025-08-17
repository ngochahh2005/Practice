import kotlin.random.Random

/*
    Viết game đoán số, máy tính tạo ra 1 số ngẫu nhiên từ 0 -> 99
    Người chơi sẽ được đoán 7 lần
    Nếu đoán sai, thì báo sai và thông báo số dự đoán nhỏ hơn hay lớn hơn số máy
    Nếu đoán đúng thì báo: Chúc mừng
    => Kết thúc game hỏi người chơi có muốn chơi tiếp không?
 */

fun main(args: Array<String>) {
    var ck = "y"
    while (ck == "y") {
        var rd = Random
        var n = rd.nextInt(1, 100)
        for (i in 1..7) {
            println("Mời bạn đoán 1 số từ 1 -> 99: ")
            var x: Int = 0
            var s: String? = readLine()
            if (s != null) x = s.toInt()
            if (x == n) {
                println("Bạn đã đoán đúng, số của bạn = số máy = $n")
                break
            } else if (x > n) println("Số của bạn lớn hơn số của máy")
            else println("Số của bạn nhỏ hơn số của máy")
        }
        println("Bạn có muốn chơi tiếp không (y/n)")
        var s: String? = readLine()
        if (s != null) ck = s
    }
    println("Thank you")
}