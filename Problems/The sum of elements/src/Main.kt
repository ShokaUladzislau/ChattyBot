fun main() {
    // put your code here
    var a = readLine()!!.toInt()
    var result = 0

    while (a != 0) {
        result += a
        a = readLine()!!.toInt()
    }
    println(result)
}