import kotlin.random.Random

/*
    1. Viết ctr tạo 1 mảng 1 chiều gồm các ptử là số nguyên,
    có n ptử ngẫu nhiên, n do người dùng nhập từ bàn phím
    2. Xuất các giá trị trong mảng
    3. Đảo ngược mảng, và xuất mảng sau khi đảo ngược
    4. Sắp xếp mảng tăng dần
    5. Tính tổng các phần tử trong mảng
    6. Cho người dùng nhập 1 số bất kỳ, ktra số đó có tồn tại trg
    mảng hay không, nếu có xuất ra vị trí index của số đó trong mảng
 */
fun main(args: Array<String>) {
    var rd = Random
    var n: Int
    println("Nhap so phan tu cua mang: ")
    var ip: String? = readLine()
    if (ip == null) return
    n = ip.toInt()
    var a: IntArray = IntArray(n)
    for (i in a.indices) {
        a[i] = rd.nextInt(1001)
    }
    println("Mang la: ")
    for (x in a) print("$x\t")
    println()

    a.reverse()
    println("Mang dao la: ")
    for (x in a) print("$x\t")
    println()

    a.sort()
    println("Mang sx tang la: ")
    for (x in a) print("$x\t")
    println()

    var s: Int = 0
    for (x in a) s += x
    println("Tong cua mang = $s")

    println("Nhap 1 so")
    ip = readLine()
    if (ip == null) return
    var tmp: Int = ip.toInt()
    var idx = a.binarySearch(tmp)
    if (idx < 0) println("$tmp khong ton tai trong mang")
    else println("$tmp nam o vi tri $idx trong mang")
}