fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    shoppingList.removeAt(0) // Removing at index 0
    println(shoppingList)
}