fun main() {
    var amount = readLine()!!.toInt()
    val parts = readLine()
    var sum = 0
    var nums = parts?.split(" ")

    if (nums != null) {
        for (i in nums) {

            if (amount >= i.toInt()){
                amount -= i.toInt()
            } else {
                sum = i.toInt()
            }
        }

    }

    if (sum <= amount) {
        println("Thank you for choosing us to manage your account! You have " + (amount - sum) + " money.")
    } else {
        println("Error, insufficient funds for the purchase. You have $amount, but you need $sum.")
    }

}