/*
    9. Parametter List Method (Là 1 trường hợp của Overloading Method)
    Trong trường hợp ta không thể nắm bắt được số lượng đối số vào, hoặ số lượng đối số quá lớn. Kotlin cung cấp thêm lựa
    chọn Parametter List.
 */
class Bai24_ParametterListMethod {
    fun tinhTong(vararg dsSo: Int): Int {
        var s = 0
        for (so in dsSo) {
            s += so
        }
        return s
    }

}