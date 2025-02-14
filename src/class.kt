class bankAccount(private var accountNumber:String, private var balance:Double, private var interestRate:Double){
    fun deposit(amount:Double){
        if(amount>0) {
            balance += amount
            println("$amount has been deposited")
        }else{
            println("invalid amount")
        }
    }

    fun withdraw(amount:Double){
       if(amount>0 && amount<=balance){
           balance -= amount
           println("$amount has been withdrawed")
       }else{
           println("invalid amount")
       }
    }

    fun interestAmount(){
        val interest= balance * interestRate /100
        balance += interest
        println("$interest has been interested and the new balance is $balance")
    }

    fun displayBalance(){
        println("$accountNumber and balance is $balance")
    }
}

fun main(){
    var myBankAccount = bankAccount("MD1104", 15000.0,5.0)
    myBankAccount.displayBalance()
    myBankAccount.deposit(500.0)
    myBankAccount.withdraw(100.0)
    myBankAccount.interestAmount()

}