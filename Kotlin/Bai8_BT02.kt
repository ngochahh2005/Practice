import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
    var r: Double = 0.0
    println("Nhap vao ban kinh r: ")
    var s: String? = readLine()
    if (s != null) r = s.toDouble()
    println("Chu vi hinh tron la: " + (2 * PI * r))
    println("Dien tich hinh tron la: " + (r.pow(2) * PI))
}