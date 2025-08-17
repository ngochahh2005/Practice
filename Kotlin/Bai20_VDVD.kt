/*
    Nhập vào 1 chuỗi từ bàn phím,
    dếm xem có bao nhiêu ký tự thường
    bao nhiêu in hoa
    bao nhiêu số
    bao nhiêu space
 */
fun main(args: Array<String>) {
    var s: String = ""
    var ip: String? = readLine()
    if (ip != null) s = ip
    var n: Int = s.length
    var lw: Int = 0
    var up: Int = 0
    var nb: Int = 0
    var sp: Int = 0
    for (i in 0..n-1) {
        if (s[i].isDigit()) nb++
        else if (s[i].isLetter()) {
            if (s[i].isLowerCase()) lw++;
            else up++
        } else if(s[i].isWhitespace()) sp++
    }
    println("So ky tu in thuong la: $lw")
    println("So ky tu in hoa la: $up")
    println("So so la: $nb")
    println("So ki tu khoang cach la: $sp")
}