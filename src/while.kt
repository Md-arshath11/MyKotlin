fun main(){
    var currentBalance=10000

    while(true){
        println("Current balance is $currentBalance")
        println("enter the amount to withdraw or 0 to exit")
        var amount =readLine()?.toIntOrNull()?:0

        if(amount==0){
            println("you can exit")
            break
        }
        if(amount > currentBalance){
            println("you don't have enough money")
            continue
        }

        currentBalance -= amount

        println("Withdrawal Successfull ,Current balance is $currentBalance")
    }


}