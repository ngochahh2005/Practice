fun main(args: Array<String>) {
    var a: Int = 35
    var b: Long = a.toLong()
    //kiem tra kieu loai
    println("a = $a kieu " + a::class.java.typeName)
    println("b = $b kieu " + b::class.java.typeName)
}