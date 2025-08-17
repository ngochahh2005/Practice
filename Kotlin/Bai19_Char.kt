fun main(args: Array<String>) {
    var kt: Char = 'a'
    println(kt)
    println(kt::class.java.typeName)

    var kt2 = '?'
    println(kt2)
    println(kt2::class.java.typeName)

    var kt3: Char = Char(110) //ma ASCII
    println(kt3)

    //Ep kieu char cho du lieu truyen vao
    println("Nhap vao 1 ky tu: ")
    var s: String? = readLine()
    if (s == null) return
    var ch: Char = s.first()    //cach 1
    var ch2: Char = s[0]        //cach 2
    var ch3: Char = s.single()  //cach 3
    println(ch)
    println(ch2)
    println(ch3)

    //so sanh tra ve 1 so nguyen
    println('C'.compareTo('B')) // tra ve 1 vi 'C' > 'B'
    println('A'.compareTo('B')) // tra ve -1 vi 'A' < 'B'
    println('B'.compareTo('B')) // tra ve 0 vi 'B' = 'B'

    //so sanh tra ve true/false
    println('a'.equals('b')) // tra ve false do 'a' != 'b'
    println('b'.equals('b')) // tra ve true do 'b' != 'b'

    //method - phuong thuc
    println('8'.isDigit()) //kiem tra co phai chu so khong
    println('a'.isLetter()) //kiem tra co phai chu cai khong
    println(' '.isWhitespace()) //kiem tra co phai khoang cach khong
    println('u'.isLowerCase()) //kiem tra co phai viet thuong khong
    println('U'.isUpperCase()) //kiem tra co phai viet hoa khong
}