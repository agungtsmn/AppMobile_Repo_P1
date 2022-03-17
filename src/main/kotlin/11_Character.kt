fun main() {

    var charA :Char = 'A' // mendeklarasikan variabel charA dengan tipe data Char dan nilai 'A'

    // output dari variabel di atas
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())

    // mendeklarasikan variabel strA dengan tipe data String dan nilai dari variabel charA
    val strA :String = charA.toString()
    println("Kini charA sudah menjadi String = $strA")

}