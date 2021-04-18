fun main() {
    val input = readLine()!!.toInt()
    var max = 0


    repeat(input) {
        var component = readLine()!!.toInt()
        if (component % 4 == 0 && component > max) max = component
    }
    print(max)
}