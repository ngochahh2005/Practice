import kotlin.random.Random

fun main(args: Array<String>) {
    //khai bao mang
    var a: IntArray = IntArray(5)
    var a2: FloatArray = FloatArray(3)
    println(a::class.java.typeName)
    for (i in a) println(i)

    //Khoi tao
    var a3: IntArray = intArrayOf(1, 2, 5, 8, 7)
    //duyet mang
    for (i in a3) print("$i\t")

    //mang gia tri ngau nhien
    var rd = Random
    var a4: IntArray = IntArray(6)
    println("\n" + a4.indices) // tra ve 0 -> size - 1
    for (i in a4.indices) {
        a4[i] = rd.nextInt(101)
    }
    println("Mang a4 ngau nhien la: ")
    for (i in a4) println(i)

    println("So phan tu cua mang a4 la: " + a4.size)

    //phep gan mang
    var a5 = arrayOf(1, 2, 3, 4, 5)
    var a6 = a5
    a5[0] = 113
    println(a5[0])
    println(a6[0])

    //tao mang moi tren vung nho moi (clone)
    var a7 = arrayOf(2, 5, 8, 9)
    var a8 = a7.clone()
    a7[0] = 999
    println(a7[0])
    println(a8[0])

    //dao nguoc mang
    var a9 = arrayOf(6, 5, 4, 7, 8)
    a9.reverse()
    println("Mang sau dao la: ")
    for (i in a9) print("$i\t")
    println()

    //sap xep tang dan
    var a10 = arrayOf(4, 5, 100, 5, 9, 8)
    a10.sort()
    println("Mang sau sx tang la: ")
    for (i in a10) print("$i\t")
    println()
    //sap xep giam dan
    a10.sortDescending()
    println("Mang sau sx giam la: ")
    for (i in a10) print("$i\t")
    println()

    //trich loc mang theo dieu kien (filter)
    var a11 = arrayOf(1, 3, 5, 7, 8,10)
    var ds = a11.filter { i -> i % 2 == 0 } //tra ve kieu list
    println(ds)

    //tim max, min
    var a12 = arrayOf(5, 7, 8, 100, 88, 99)
    println("min = ${a12[0]} = ${a12.first()}")
    println("max = ${a12[a12.size - 1]} = ${a12.last()}")
}