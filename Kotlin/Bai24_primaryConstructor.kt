/*
    3. Constructors (hàm tạo)
    -   Là hàm dùng để tự động khởi tạo giá trị cho đối tượng, khi đối tượng được sinh ra
    -   Kotlin có 2 loại Constructors: primary constructor và secondary constructors
        3.1. primary constructor (Hàm tạo chính)
        +   Hàm tạo chính là 1 phần của tiêu đề lớp, nó đặt sau tên lớp
            VD: class SinhVien constructor(ma: Int, ten: String) {}
        +   primary constructor chỉ có 1
        +   Nếu mối thực hiện các logic code thì khai báo trong init {}
        + Cú pháp: Tạo 1 đối tượng mới: var tenDoiTuong = tenLop()
 */
class Bai24_primaryConstructor constructor(ma: Int, ten: String, cccd: String) {
    init {
        println("Bạn đang ở primary constructor")
        println("$ma - $ten")
    }
}