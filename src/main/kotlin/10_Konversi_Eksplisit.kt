fun main() {

    val valInt: Int = 1 // Mendeklarasikan variabel bertipe data Interger

    val valSum: Long = 3L + valInt // Konversi implisit
    println("Konversi variabel valInt secara implisit : $valSum")

    val valLong: Long = valInt.toLong() // Konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : $valLong")

}