fun main(args: Array<String>) {
    var i = 7

    //kiem tra so i > 0 va i < 10
    println(i > 0 && i < 10)
    //phep hoac
    println(i > 0 || i < 10)
    //phu dinh
    println(!(i > 0 || i < 10))

    //phuong thuc
    println((i>0).and(i < 10))
    println((i>0).or(i < 10))
    println(!((i>0).or(i < 10)))
}