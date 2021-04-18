fun main() {
    val elems = readLine()!!.toInt()
    var max = 1
    var current = 1

    if (elems == 1) {
        println(readLine())
    } else {
        repeat(elems) {
            val elem = readLine()!!.toInt()
            if (elem > max) {
                current = max
                max = elem
            } else if (elem > current) {
                current = elem
            }
        }
        println(max * current)
    }
}
