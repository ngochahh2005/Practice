/*
    7. Tham chiếu this
    Phân biệt Instance variable và Local variable
    -   Instance variable: biến có thể truy xuất tại mọi nơi trong class
    -   Khi biến Local và biến Instance trùng tên. Trong hàm muốn sử dụng biến Instance phải sử dụng từ khóa this.
 */
class Bai24_thamChieuThis {
    //Instance var
    var diemVan: Float = 0f
    var diemToan: Float = 0f

    fun testCucBo(diemVan: Float, diemToan: Float) {
        println("Tong diem trong bien cuc bo: " + (diemVan + diemToan))
        println("Tong diem trong instance var: " + (this.diemVan + this.diemToan))
    }
}