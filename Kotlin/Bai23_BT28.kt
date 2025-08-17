/*
    Viết chương trình in số lớn thứ 2 và số nhỏ thứ 2 trong list.
    In ra vị tri index số đó
 */
fun main(args: Array<String>) {
    var l: MutableList<Int> = mutableListOf(1, 2, 5, 1, 2, 4, 8, 7, 8, 10, 10)
    var cl: MutableList<Int> = l.toMutableList()
    cl.sort()
    var min: Int = cl[0]
    var max: Int = cl[cl.size - 1]
    while (cl.contains(min)) {
        cl.remove(min)
    }
    while (cl.contains(max)){
        cl.remove(max)
    }

    println("số nhỏ thứ 2 là: ${cl[0]}")
    for (i in l.indices) {
        if (l[i] == cl[0]) print("$i\t")
    }
    println()

    println("số lớn thứ 2 là: ${cl[cl.size - 1]}")
    for (i in l.indices) {
        if (l[i] == cl[cl.size - 1]) print("$i\t")
    }
}