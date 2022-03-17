fun main() {

    var varBool : Boolean = true // deklarasi variabel varBool dengan tipe data Boolean
    if (varBool)
        println("varBool bernilai = $varBool")

//    var varInt : Int = 1 // deklarasi variabel varInt dengan tipe data Integer
//    if (varInt)
//        println("varInt bernilai = $varInt")

    /**
     * Pada baris ke 8 di kode if(varInt) terdapat error disebabkan karena tipe data pada variabel varInt bertipe
     * Integer yang tidak memiliki kondisi true dan false, sedangkan pada percabangan dibutuhkan sebuah kondisi.
     */

    var varInt_2 : Int = 1 // deklarasi variabel varInt dengan tipe data Integer
    if (varInt_2 == 1)
        println("varInt bernilai = $varInt_2")

}