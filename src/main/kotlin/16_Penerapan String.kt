fun main() {

    var s = "Monkey D Luffy."
    println(s)
    s = s.toLowerCase()

    var vowelCount = 0
    var consonantCount = 0

    val vowels = "monkeydluffy"
    val consonants = "monkeydluffy"

    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }

    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")

}