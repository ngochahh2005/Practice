/*
    Viết chương trình kiểm tra tính hợp lệ của mật khẩu: aaaAAAAAA1
    + Mật khẩu hợp lệ khi có ít nhất 6 ký tự
    + Chứa ít nhất 1 chữ cái (chữ cái thường/hoa đều được)
    + Chứa ít nhất 1 chữ số
    Cho người dùng đăng nhập vào mật khẩu để login/so sánh,
    nếu đúng mở cửa, sai quá 5 lần khóa đăng nhập, thoát ctr
 */
fun check( s: String): Boolean {
    if (s.length < 6) return false
    var lt: Boolean = false
    var nb: Boolean = false
    for (i in 0 until s.length) {
        if (s[i].isDigit()) nb = true
        else if (s[i].isLetter()) lt = true
        if (nb && lt) return true
    }
    return false
}

fun main(args: Array<String>) {
    var mk: String = "aaaaaAAAAAA1"
    if (check(mk)) println("Hợp lệ")
    else println("Không hợp lệ")
    for (i in 1..5) {
        println("Nhập mật khẩu: ")
        var s: String? = readLine()
        if (s == null) return
        if (s == mk) {
            println("Mật khẩu đúng!")
            return
        }
    }
    println("Mật khẩu sai!")
}