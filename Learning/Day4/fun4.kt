fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    shoppingList.remove("SSD")
    shoppingList.add("HDD")
    println(shoppingList)
}