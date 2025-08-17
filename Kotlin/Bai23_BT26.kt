/*
    Viết chương trình trả lời kết quả cho phép tính:
    quest = {"2 + 5 + 7 =", "5 * 10 =", "sqrt(16) =", "12%2 =", "5//2 = "}
 */
fun main(args: Array<String>) {
    var l: List<String> = listOf<String>("2 + 5 + 7 = ", "5 * 10 = ", "sqrt(16) = ", "12 % 2 = ", "5 // 2 = ")
    var k: List<String> = listOf<String>("14", "50", "4", "0", "2")
    for (i in l.indices) {
        print(l[i])
        var ip: String? = readLine()
        if (ip == null) return
        if (ip == k[i]) println("correct")
        else println("incorrect")
    }
}