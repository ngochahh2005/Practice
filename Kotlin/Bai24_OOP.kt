/*
    1. Khái quát lớp và đối tượng
    -   Đối tượng (object) trong lập trình hướng đối tượng như 1 đối tượng cụ thể trong
    thế giới thực
        Mỗi đối tượng có thuộc tính và hành vi riêng
        +   Thuộc tính: đặc điểm của đối tượng
        +   Phương thức: hành vi của đối tượng
        +   1 con chó tên Luccy: là 1 đối tượng cụ thể
    -   Các đối tượng có các phương thức, thuộc tính giống nhau được gom thành 1 lớp để
    dễ quản lý
    2. Tạo class
    Tên lớp nên là 1 danh từ hoặc 1 cụm danh từ, nên viết hoa ký tự đầu tiên (Car, Bird,
    Buom, SinhVien)
    Cấu trúc chung class
    -   Tên lớp
    -   Các constructors (hàm tạo)
    -   Các thuộc tính (biến lớp)
    -   Các getter/setter
    -   Các phương thức
 */
fun main(args: Array<String>) {
    //1. Tạo đối tượng primary constructor
    var sv1:Bai24_primaryConstructor = Bai24_primaryConstructor(1, "Nguyễn Văn A", "11235595")

    //2. Tạo đối tượng secondary constructors
    var sp1:Bai24_secondaryConstructors = Bai24_secondaryConstructors()
    var sp2:Bai24_secondaryConstructors = Bai24_secondaryConstructors(1, "Tivi", 1000)

    //test lop sv2
    var sv2 = Bai24_mucDoTruyXuat()
    var sv3 = Bai24_mucDoTruyXuat(1, "Loan")
    println("Thong tin sv2 la: ${sv2.ma} - ${sv2.ten}")
    println("Thong tin sv3 la: ${sv3.ma} - ${sv3.ten}")
    sv2.ma = 99
    println("Thong tin sv2 la: ${sv2.ma} - ${sv2.ten}")
    sv2.DiemToan = 9f
    println("Diem toan cua sv2 la: ${sv2.DiemToan}")
    sv2.DiemVan = 8f

    //ham tinh dtb
    var avg = sv2.dtb(sv2.DiemToan, sv2.DiemVan)
    println("Diem trung binh cua sinh vien 2 la: $avg")

    sv2.XuatThongTin()

    println(sv2)

    var nx1 = Bai24_Method(2010)
    nx1.kiemTra()

    println("---------------------")
    var test1 = Bai24_thamChieuThis()
    test1.diemVan = 7f
    test1.diemToan = 8f
    test1.testCucBo(7f, 6f)

    println("---------------------")
    var sanpham1 = Bai24_Overloading(1, "Tivi $% inch GHLD45", 1000.0)
    var sanpham2 = Bai24_Overloading(2, "Dien thoai SAMSUNG NOTE 20")

    //tinh gia sp theo chiet khau
    var gia1 = sanpham1.chietKhau()
    var gia2 = sanpham1.chietKhau(true)
    println("Gia 1 = $gia1")
    println("Gia 2 = $gia2")

    println("---------------------")
    //khoi tao 1 doi tuong de tinh tong
    var dt1 = Bai24_ParametterListMethod()
    var kq = dt1.tinhTong(1, 5, 7, 8, 9, 4, 2)
    var kq2 = dt1.tinhTong(1, 5, 7)
    println(kq)
    println(kq2)

}