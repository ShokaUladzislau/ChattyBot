fun main() {
    val input = readLine()!!.toInt()
    var perfect = 0
    var larger = 0
    var smaller = 0

    repeat(input) {
        var component = readLine()!!.toInt()
        if (component == 0) perfect++
        if (component == 1) larger++
        if (component == -1) smaller++
    }

    println("$perfect $larger $smaller")

}