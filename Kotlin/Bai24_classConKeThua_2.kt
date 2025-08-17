class Bai24_classConKeThua_2:Bai24_keThua {
    constructor(ten: String, cccd: String, que: String):super(ten, cccd, que)
    constructor(ten: String, cccd: String):super(ten, cccd)
    override fun tinhLuong(): Double {
        //cho nhan vien di ca luong 105%
        return luongCoBan*1.05 //di ca cao hon 5%
    }
}