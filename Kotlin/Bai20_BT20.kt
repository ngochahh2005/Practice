/*
    Viết chương trình chuyển tin nhắn sang mật mã theo bảng:
    #a = "abcdefghijklmnopqrstuvwxyz"
    #b = "zxcvbnmasdfghjklqwertyuiop"
 */
fun main(args: Array<String>) {
    var a: String = "abcdefghijklmnopqrstuvwxyz"
    var b: String = "zxcvbnmasdfghjklqwertyuiop"
    var s: String? = readLine()
    if (s == null) return
    var arr = s.toCharArray()
    for (ch in arr) {
        print(b[ch - 'a'])
    }
}