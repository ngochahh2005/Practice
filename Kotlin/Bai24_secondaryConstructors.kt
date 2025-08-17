/*
    3.2. secondary constructors (Hàm tạo phụ)
    +   secondary constructors được đặt trong thân class
    +   Có thể có nhiều secondary constructors cùng nằm trong 1 class
    +   constructors có thể có hoặc không có các Parameter (các đối số)
    +   Cú pháp: tạo 1 đối tượng mới: var tenDoiTuong = tenLop()
 */
class Bai24_secondaryConstructors {
    constructor() { // không đối số
        println("Đây là constructor không đối số")
    }
    constructor(ma: Int, ten: String, donGia: Int) {
        println("Đây là constructor có đối số")
        println("$ma - $ten - $donGia")
    }
}