fun main(args: Array<String>) {
//    //gan bang
//    var x = 10
//    println("x = $x")
//
//    //x = x + 5
//    x += 5
//    println("x = $x")

    var a = 3
    var b = 3
    println(a == b)
    println(a != b)
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)

    //Phuong thuc
    println("----------------")
    println(a.equals(b)) // a == b ?
    println(!a.equals(b)) // a != b ?
    // a < b <=> comparTo < 0
    // a = b <=> comparTo = 0
    // a > b <=> comparTo > 0
    println(a.compareTo(b) > 0) // a > b ?
    println(a.compareTo(b) < 0) // a < b ?
    println(a.compareTo(b) >= 0) // a >= b ?
    println(a.compareTo(b) <= 0) // a <= b ?
}