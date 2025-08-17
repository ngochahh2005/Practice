fun main(args: Array<String>) {
    var a = 10
    var b = 3

    //phep cong
    println("cach 1: a + b = " + (a+b))
    println("cach 2: a + b = " + (a.plus(b)))

    //phep tru
    println("cach 1: a - b = " + (a-b))
    println("cach 2: a - b = " + (a.minus(b)))

    //phep nhan
    println("cach 1: a * b = " + (a*b))
    println("cach 2: a * b = " + (a.times(b)))

    //phep chia
    println("cach 1: a / b = " + (a/b))
    println("cach 2: a / b = " + (a.div(b)))
    var rs: Float = a.toFloat()/b
    println("a/b = " + rs)

    //phep chia du
    println("cach 1: a % b = " + (a%b))
    println("cach 2: a % b = " + (a.rem(b)))

    var x: Float = 9.2f
    //tru 1 ngoi (dao dau)
    var y = x.unaryMinus()
    println("x = $x")
    println("y = $y")

    //cong 1 ngoi
    var z = y.unaryPlus()
    println("z = $z")
}