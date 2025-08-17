import kotlin.random.Random

fun main(args: Array<String>) {
    //khai bao mang 2 chieu co 3 hang 4 cot
    var a: Array<IntArray> = Array(3, {IntArray(4)})
    var rd = Random
    for (i in a.indices) {
        for (j in a[i].indices) {
            a[i][j] = rd.nextInt(51)
        }
    }

    //xuat mang
    for (i in a.indices) {
        for (j in a[i].indices) {
            print("${a[i][j]}\t")
        }
        println()
    }
}