import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    var cal = Calendar.getInstance()
    println(cal)

    //get ngay thang nam
    var nam = cal.get(Calendar.YEAR)
    var thang = cal.get(Calendar.MONTH)
    var ngay = cal.get(Calendar.DAY_OF_MONTH)
    println("Ngay thang nam hien tai = $ngay/${thang + 1}/$nam")

    //set ngay thang nam theo y muon
    cal.set(Calendar.YEAR, 2005)
    cal.set(Calendar.MONTH, 7)
    cal.set(Calendar.DAY_OF_MONTH, 28)

    //Kiem tra date sau thiet lap
    var y = cal.get(Calendar.YEAR)
    var m = cal.get(Calendar.MONTH)
    var d = cal.get(Calendar.DAY_OF_MONTH)
    println("Ngay thang nam sinh = $d/${m+1}/$y")

    //xuat theo dinh dang ngay thang nam dd/MM/yyyy
    var date = cal.time
    //Khai bao dinh dang
    var dinhDang = SimpleDateFormat("dd/MM/yyyy")
    println(dinhDang.format(date))
    //Khai bao dinh dang loai 2
    var dinhDang2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
    println(dinhDang2.format(date))
}