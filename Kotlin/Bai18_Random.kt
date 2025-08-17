import kotlin.random.Random

fun main(args: Array<String>) {
    //khởi tạo random
    var rd = Random
    //random số nguyên
    var rdNguyen = rd.nextInt(100) //chạy từ 0 -> 99
    println(rdNguyen)

    //random trong đoạn [a, b)
    var rd2 = rd.nextInt(-100, 50)
    println(rd2)

    //random số thực
    var rd3 = rd.nextDouble() //[0, 1)
    println(rd3)

    //random số thực ngoài đoạn [0, 1)
    //cách 1:
    var rd4 = rd.nextInt(-50, 50)
    var rd5 = rd.nextDouble()
    var rd6 = rd4 + rd5
    println(rd6)
    //cách 2:
    var rd7 = rd.nextDouble()
    println(rd7*100)
}