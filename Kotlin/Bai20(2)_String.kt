fun main(args: Array<String>) {
    //Xoa toan bo khoang trong o dau va cuoi
    var s = "      Hello    PTIT            "
    var s1 = s.trim()
    println(s + "\n" + s.length)
    println(s1 + "\n" + s1.length)

    //Xoa khoang trong o cuoi chuoi
    var s2 = s.trimEnd()
    println(s2 + "\n" + s2.length)

    //Xoa khoang trong o dau chuoi
    var s3 = s.trimStart()
    println(s3 + "\n" + s3.length)

    //so sanh 2 chuoi
    var s4 = "abc13579"
    var s5 = "Abc13579"
    var x = s4.compareTo(s5)
    println(x)

    //Noi chuoi
    var s6 = "Today"
    var s7 = s6 + " is rainy day"
    println(s7)
    var s8 = s7.plus(" so I feel bad")
    println(s8)

    //Noi chuoi (sd StringBuilder) - toc do nhanh
    //khai bao
    var s9 = StringBuilder()
    //khoi tao
    var s10 = StringBuilder("o vui qua")

    //chen chuoi
    s10.insert(2, "he he ")
    println(s10)

    //them noi duoi
    s10.append(" vui qua xa la vui")
    println(s10)

    //dao chuoi
    s10.reverse()
    println(s10)

    //tach chuoi tra ve list
    var s11 = "music.mp3.mp4"
    var a: List<String> = s11.split(".")
    for (i in a) println(i)

    //chuyen chuoi ve chu thuong, hoa
    var s12 = "Hello PTIT"
    var s13 = s12.lowercase()
    var s14 = s12.uppercase()
    println(s12)
    println(s13)
    println(s14)

    //tach chuoi thanh ky tu cho vao mang
    var mk = "abc13579"
    var a2 = mk.toCharArray()
    for (j in a2) {
        println(j)
        println(j::class.java.typeName)
    }
}