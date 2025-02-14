fun main() {
    println("Enter your name: ")
    var name = readLine() ?: "unknown"

    println("Enter your age: ")
    val age = readLine()?.toIntOrNull() ?: 0

    println("Enter your Current Status:Student,Employee,Intern")
    val status = readLine() ?: "unknown"

    voteEligibility(age)
    currentStatus(status)


}

fun voteEligibility(age: Int) {
    if (age < 18) {
        println("You're Eligible for Vote")
    }else{
        println("You're not Eligible for Vote")
    }
}
fun currentStatus(status: String) {
    when (status) {
        "Student" -> println("You're a Student")
        "Employee" -> println("You're a Employee")
        "Intern" -> println("You're a Intern")
        else -> println("You're not a neither a Student, nor Employee")
    }
}

