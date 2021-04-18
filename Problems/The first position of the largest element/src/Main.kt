import java.util.Scanner

fun main() {
    // put your code here
    val sc = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var pos = 0
    var counter = 0

    while (sc.hasNext()) {
        val curr = sc.nextInt()
        counter++
        if (curr > max) {
            max = curr
            pos = counter
        }
    }
    println("$max $pos")
}