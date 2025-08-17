/*
    8. Overloading Method
      8.1. Signature gọi là khác nhau nếu chúng khác nhau về:
      -  Số lượng các đối số
      -  Kiểu dữ liệu các đối số
      -  Thứ tự các đối số
      8.2. Overloading Method: trong cùng class có nhiều phương thức cùng tên nhưng khác nhau về Signature
      8.3. Constructor: là trường hợp đặc biệt của Overloading Method
 */
class Bai24_Overloading {
    //instance var
    private var maSP: Int = 0
    private var tenSP: String = ""
    private var giaSP: Double = 0.0

    //constructor
    constructor(maSP: Int, tenSP: String, giaSP: Double) { //3 doi so
        this.maSP = maSP
        this.tenSP = tenSP
        this.giaSP = giaSP
    }

    constructor(maSP: Int, tenSP: String) { // 2 doi so
        this.maSP = maSP
        this.tenSP = tenSP
    }

    constructor(tenSP: String, maSP: Int) { // 2 doi so
        this.maSP = maSP
        this.tenSP = tenSP
    }

    fun chietKhau(): Double {
        return this.giaSP * 0.95 // giam 5%
    }

    fun chietKhau(sinhNhat: Boolean): Double {
        if (sinhNhat) return this.giaSP * 0.9 // giam 10%
        return chietKhau()
    }
}