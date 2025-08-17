import java.text.SimpleDateFormat
import java.util.Calendar

/*
    Viết ctr nhập vào ngày tháng năm sinh.
    Cho biết số tuổi và in ra màn hình.
 */

fun main(args: Array<String>) {
    var dinhDang = SimpleDateFormat("dd/MM/yyyy")
    println("Nhập ngày tháng năm sinh (dd/MM/yyyy): ")
    var s = readLine()
    if (s == null) return
    //ep kieu
    var input = dinhDang.parse(s)
    //khoi tao bien date time
    var birthYear = Calendar.getInstance()
    birthYear.time = input
    var nam = birthYear.get(Calendar.YEAR)
    var thang = birthYear.get(Calendar.MONTH)
    var ngay = birthYear.get(Calendar.DAY_OF_MONTH)
    println("Ngày tháng năm sinh của bạn là: $ngay/${thang+1}/$nam")

    //khoi tao bien date time
    var curYear = Calendar.getInstance()
    println("Tuổi của bạn là: ${curYear.get(Calendar.YEAR) - nam}")
}