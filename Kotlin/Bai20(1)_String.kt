fun main(args: Array<String>) {
    var s: String = "ABC"
    var s2 = "abc d"
    var s3: String = "Có người nói rằng \"Học, học nữa, học mãi\""
    println(s3)
    var s4 = "D:\\myfolder"
    println(s4)
    var s5 = "line 1\tline 2"
    println(s5)
    println(s4.length)

    var s6 = "abcdaaaef"
    println(s6[3])

    //Kiem tra vtri xh dau tien cua ky tu/chuoi, tra ve -1 neu khong tim thay
    println(s6.indexOf("a"))
    //Kiem tra vtri xh cuoi cung cua ky tu/chuoi, tra ve -1 neu khong tim thay
    println(s6.lastIndexOf("a"))

    //Kiem tra chuoi a co phai chuoi con cua b khong
    var a = ".mp3"
    var b = "music.mp3"
    var ck: Boolean = b.contains(a)
    if (ck) println("Co $a trong $b")
    else println("$a khong nam trong $b")

    //Trich loc chuoi con tu chuoi ban dau
    var s7 = "0123456789"
    var s8 = s7.substring(2)
    println(s8)
    var s9 = s7.substring(2, 9)
    println(s9)

    //Thay the toan bo chuoi cu bang chuoi moi
    //replace("str old", "str new", "ignoreCase = true/false")
    //ignoreCase: Bo qua phan biet hoa thuong, neu khong truyen kotlin tu hieu = false
    var s10 = "Học HỌC nữa học mãi"
    var s11 = s10.replace("học", "Ngủ")
    println(s10)
    println(s11)
    var s12 = s10.replace("học", "Ngủ", ignoreCase = true)
    println(s10)
    println(s12)

    //Thay the chuoi dau tien tim thay
    var s13 = s10.replaceFirst("học", "Ngủ", ignoreCase = true)
    println(s10)
    println(s13)
}