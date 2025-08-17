/*
    4. Biến lớp
          4.1. Quy tắc khai báo: giống khai báo biến thông thường, quy tắc camel (maSV, tenSV,
          tenBien, canhHuyen,...)
          4.2. Mức độ truy xuất: mức bảo vệ đi từ thấp đến cao (1 -> 3)
          1 - public/không ghi gì: truy xuất được mọi nơi
          2 - protected: chỉ truy xuất ở trong class hoặc class kế thừa
          3 - private: truy xuất trong class
    5. get-set: xem sửa dữ liệu khi biến đặt private
    -   Trong nhiều trường hợp, ta chỉ muốn 1 nhóm người truy cập được vào, thay đổi các giá
    trị của biến private => sử dụng getter và setter
    -   get, set sẽ giúp xem, sửa dữ liệu từ bên ngoài
    -   Các biến để get, set người ta còn gọi là properties
    6. Phương thức (Method)
    -   Là các hàm bên trong lớp (hay nói cách khác nó là các khối lệnh thực hiện 1 công việc
    hoàn chỉnh)
    -   Có 2 loại phương thức: có return và không có return
 */
class Bai24_mucDoTruyXuat {
    public var ma: Int = 0  // co public hay khong deu duoc
    var ten: String = ""

    //khai bao private
    private var diemToan: Float = 0f
    //khai bao properties
    var DiemToan: Float
        get() {return diemToan}
        set(value) {diemToan = value}

    private var diemVan: Float = 0f
    var DiemVan: Float
        get() {return diemVan}
        set(value) {diemVan = value}

    constructor() {
        ma = 0
        ten = "No name"
    }
    //constructor 2 doi so
    constructor(m: Int, t: String) {
        ma = m
        ten = t
    }

    //1. Ham tinh diem trung binh co return
    fun dtb(diemToan: Float, diemVan: Float): Float {
        return (diemToan + diemVan) / 2
    }

    //2. Ham xuat thong tin khong return
    fun XuatThongTin() {
        println("Ten sinh vien la: $ten")
        println("Ma sinh vien la: $ma")
    }

    //3. toString()
    override fun toString(): String {
        return "Ma sinh vien: $ma, ten sinh vien: $ten"
    }
}