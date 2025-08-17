/*
    10. Khái quát kế thừa:
    -   Kế thừa: tạo ra các lớp con, để tái sử dụng những thành phần của lớp cha đã có
    -   Ưu điểm: giúp code ngắn gọn, không cần phải viết lại những code mà lớp cha đã có
        => thuận tiện trong quản lý, dễ sửa đổi theo từng khối.
    -   Cú pháp: lớp cha sử dụng open để cho phép kế thừa. Nếu có hàm abstruct (hàm trừu tượng trong thân class Cha) thì
    cần thêm keyword abstruct sau open.
 */
open abstract class Bai24_keThua {
    //instance var
    protected var ten: String = ""
    protected var cccd: String = ""
    protected var que: String = ""
    val luongCoBan: Double = 1200.0 // 1200$

    //Hàm trừu tượng: ép tất cả các class con của nó phải có hàm này
    public abstract fun tinhLuong(): Double
    constructor(ten: String, cccd: String, que: String) {
        this.ten = ten
        this.cccd = cccd
        this.que = que
    }

    constructor(ten: String, cccd: String) {
        this.ten = ten
        this.cccd = cccd
    }

}