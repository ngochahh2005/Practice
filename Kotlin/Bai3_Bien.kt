fun main(args: Array<String>) {
    var a:Int = 113 //cho phep thay doi gia tri cua bien
    val b:Int = 8 //khai bao hang (ko the thay doi gia tri)
    println("a = $a")
    println("Gia tri cua so a la: " + a)
    println("b = $b")

    //kieu double
    var c: Double = 8.5
    var d = 10.8
    println("Kieu du lieu cua c la: " + (c::class.java.typeName))
    println("Kieu du lieu cua d la: " + (d::class.java.typeName))

    //kieu float
    var e: Float = 7.5f
    println("Kieu du lieu cua e la: " + (e::class.java.typeName))

    //kieu int
    var f: Int = 13
    var g = 15
    println("Kieu du lieu cua f la: " + (f::class.java.typeName))
    println("Kieu du lieu cua g la: " + (g::class.java.typeName))

    //kieu long
    var h: Long = 50000L
    var i = 15L
    println("Kieu du lieu cua h la: " + (h::class.java.typeName))
    println("Kieu du lieu cua i la: " + (i::class.java.typeName))

    //kieu Short
    var k: Short = 32767

    //Khai bao ky tu
    var ch: Char = '1'

    //khai bao chuoi
    var s1: String = "hello world"
    var s2: String = "a"
    var s3 = "hello ptit"
    println("Kieu du lieu cua s3 la: " + (s3::class.java.typeName))

    //Khai bao doan
    var s4 = """
        Thân em vừa trắng lại vừa tròn
        Bảy nổi ba chìm với nước non
    """.trimIndent()
    println(s4)

    //khai bao bool
    var ck: Boolean = false

    //khai bao mang
    var mangSoThuc: FloatArray = floatArrayOf(0.5f, 7.5f, 5.8f)
    var mangKyTu: CharArray = charArrayOf('a', 'b', 'c', 'd')
    
}