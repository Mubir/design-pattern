package facadepattern

fun main(arg:Array<String>){

    val  facade = BankFacade(666,"Amon")

    facade.thankYouTxt()
}