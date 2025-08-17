fun main(args: Array<String>) {
    //ep tu chuoi -> kieu du lieu khac
    var a1: Boolean = "true".toBoolean()
    println(a1)
    println(a1::class.java.typeName)

    var a2: Byte = "2".toByte()
    var a3: Short = "20".toShort()
    var a4: Int = "20".toInt()
    var a5: Float = "20.5".toFloat()
    println(a5)
    println(a5::class.java.typeName)

    //Nhap chuoi tu ban phim
    println("Nhap ten cua ban: ")
    var nm: String? = readLine()
    println("Ten vua nhap la: $nm")

    //nhap so tu ban phim
    var a: Int = 0
    println("Nhap vao so tuoi: ")
    var age: String? = readLine()
    if (age != null) {
        a = age.toInt()
        println("Tuoi ban la: $a")
    }
}