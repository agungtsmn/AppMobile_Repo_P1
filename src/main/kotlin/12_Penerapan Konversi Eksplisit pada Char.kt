fun main() {

    var c: Char // deklarasi variabel Char
    var i: Int // deklarasi variabel Integer

    c = 'a'
    i = c.toInt() // merubah nilai pada variabel c ke tipe data Integer

    println("The character $c was converted to its ASCII value of $i")

    i = 98
    c = i.toChar() // merubah nilai pada variabel i ke tipe data Char

    println("the ASCII value of $i was converted to its textual value of $c")

}