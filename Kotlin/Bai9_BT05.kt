fun main(args: Array<String>) {
    var h: Float = 0.0f
    var w: Float = 0.0f

    println("Nhập chiều cao: ")
    var s1: String? = readLine()
    if (s1 != null) h = s1.toFloat()
    println("Nhập cân nặng: ")
    var s2: String? = readLine()
    if (s2 != null) w = s2.toFloat()

    var bmi: Float = (w/(h * h))

    if (bmi < 15) println("Thân hình quá gầy")
    else if (bmi < 16) println("Thân hình gầy")
    else if (bmi < 18.5) println("Thân hình hơi gầy")
    else if (bmi < 25) println("Thân hình bình thường")
    else if (bmi < 30) println("Thân hình hơi béo")
    else if (bmi < 35) println("Thân hình béo")
    else println("Thân hình quá béo")
}