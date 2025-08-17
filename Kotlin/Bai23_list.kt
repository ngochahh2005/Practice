/*
    List hỗ trợ thêm, xóa và thay đổi kích thước của list
    2 loại list:
    + MutableList: là collection có thể thay đổi kích thước dữ liệu: thêm, sửa, xóa
    + List: là collection chỉ có nhiệm vụ readOnly, dùng để hiển thị thông tin.
    Ưu điểm của List tối ưu bộ nhớ hơn MutableList. Do đó nếu chỉ để hiển thị thông tin thì nên dùng List
 */
fun main(args: Array<String>) {
    //1. Khai bao MutableList
    var l1: MutableList<Int> = mutableListOf()
    println(l1::class.java.typeName)

    //2. Khai bao List (read only)
    var l2: List<Int> = listOf()
    println(l2::class.java.typeName)

    //Khoi tao
    var l3: MutableList<Int> = mutableListOf(2, 5, 4, 7, 8)
    println(l3)

    var l4: List<Int> = listOf(1, 2, 3, 4)
    println(l4)

    //duyet List
    var l5: MutableList<Int> = mutableListOf(2, 5, 4, 7, 8, 9, 10)
    println(l5.indices)
    for (i in l5.indices) print("${l5[i]}\t")
    println()

    //size
    var l6: MutableList<Int> = mutableListOf(2, 5, 4)
    println(l6.size)

    //add (them 1 phan tu)
    l6.add(7)
    println(l6)
    l6.add(2, 9)
    println(l6)

    //addAll
    //them 1 list vao cuoi list
    l6.addAll(mutableListOf(2, 2, 2))
    println(l6)
    //them 1 list vao vi tri nao do
    l6.addAll(1, mutableListOf(4, 4, 4))
    println(l6)

    //removeAt (xoa tai 1 vi tri index chi dinh)
    l6.removeAt(0)
    println(l6)

    //remove (xoa phan tu dau tien trung khop)
    l6.remove(2)
    println(l6)

    //sap xep tang dan
    l6.sort()
    println(l6)

    //sap xep giam dan
    l6.sortDescending()
    println(l6)

    //filter
    var l7 = l6.filter { x->x>5 }
    println(l7)

    //contains -> tra ve true/false
    println(l6.contains(4))

    //clear
    l6.clear()
    println(l6)
}