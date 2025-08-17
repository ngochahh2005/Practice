/*
    a = "
    tôi chăm học
    tôi chịu khó
    tôi đẹp zai
    "
    đếm từ tôi trong string a trên
 */
fun main(args: Array<String>) {
    var a: String = "\ntôi chăm học\ntôi chịu khó\ntôi đẹp zai"
    var l: List<String> = a.split(" ")
    var cnt: Int = 0
    for (x in l) {
        if (x.contains("tôi")) cnt++
    }
    println(cnt)
}