/*
    Viết chương trình tách số và chữ từ chuỗi nhập vào thành 2 chuỗi
    VD: nhập vào "abc123" sẽ tách và in ra thành 2 chuỗi "abc" và "123"
 */
fun main(args: Array<String>) {
    var s: String? = readLine()
    if (s == null) return
    var nb: String = ""
    var lt: String = ""
    for (c in s) {
        if (c.isDigit()) nb += c
        else if (c.isLetter()) lt += c
    }
    println(lt + "\n" + nb)
}