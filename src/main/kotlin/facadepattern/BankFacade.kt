package facadepattern

class BankFacade(val acc: Int, val name: String) {
    // hidden from client
    var welcome: Welcome = Welcome()
    var accountCheck: AccountCheck = AccountCheck(acc,name)
    // hidden from client
    var securityCheck: SecurityCheck = SecurityCheck()
    // hidden from client
    var fundCheck: FundCheck = FundCheck()

    fun thankYouTxt(){
        println(" ${accountCheck.name} thanks for using our service.")
    }

}