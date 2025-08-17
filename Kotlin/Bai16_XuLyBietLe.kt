//fun main(args: Array<String>) {
//    var a = 10
//    var b = 2
//    try {
//        var c = a/b
//        println(c)
//    }
//    catch(e: Exception) {
//        e.printStackTrace()
//    }
//    finally {
//        println("Thoat khoi database")
//    }
//    println("Doan code phia sau")
//}

fun thuong(a: Int, b: Int): Int {
    if (b == 0) throw Exception("Mau = 0 khong chia duoc")
    return a/b
}

fun main(args: Array<String>) {
    try {
        var c = thuong(5, 0)
        println(c)
    }
    catch (e: Exception) {
        println(e.message)
    }
    finally {
        println("Da dang xuat khoi csdl")
    }
    println("Doan code phia sau")
}