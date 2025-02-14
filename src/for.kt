fun main() {
    print("Enter a number:")
    val num = readLine()?.toIntOrNull() ?: return

    var isPrime = true
    for (i in 2 until num) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
    if (isPrime && num > 1) {
        println("$num is prime")
    } else {
        println("$num is not prime")
    }
}
