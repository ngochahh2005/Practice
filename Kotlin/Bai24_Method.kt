import java.util.Calendar

/*
    6. Method (Phương thức): có 2 dạng phương thức triển khai trong class
    -   Một lớp có nhiều phương thức, có những phương thức public ra ngoài (public, hay service method): truy xuất được từ
    bên ngoài => dùng từ khóa public, hoặc không ghi gì
    -   Còn những phương thức chỉ sử dụng trong lớp (private, gọi là support method), dùng để hỗ trợ bên trong phương thức.
    Không  truy xuất được từ bên ngoài => dùng từ khóa private.
 */
class Bai24_Method {
    // Khai báo biến năm sinh
    private var namSinh: Int = 0
    // khai bao properties
    var NamSinh: Int
        get() {return namSinh}
        set(value) {namSinh = value}

    //khai bao constructor
    constructor(y: Int) {
        namSinh = y
    }

    //support method
    private fun checkTuoi(): Boolean {
        var cal = Calendar.getInstance()
        var curYear: Int = cal.get(Calendar.YEAR)
        var tuoi: Int = curYear - namSinh
        return tuoi >= 18
    }

    //sevice method
    fun kiemTra() {
        if (checkTuoi()) println("Moi dat ve")
        else println("Ban khong du tuoi de xem phim nay, vui long xem phim khac")

    }
}