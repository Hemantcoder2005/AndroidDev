# List And Objects
## Multiline Comments
```kotlin
/*
fun getSum(a : Int ,b : Int) : Int {
    return a + b
}
 */
```
Above we have multiline Comments.
## List
-  Declearing of List below (File : fun1.kt)
```kotlin
fun main(){
    val shoppingList =  listOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU", "CoolingFans" )
    println(shoppingList)
}
```
- creating Multable List (File : fun2.kt)
```kotlin
fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU", "CoolingFans" )
    println(shoppingList)
}
```
- adding elements in list (File : fun3.kt)
```kotlin
fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    shoppingList.add("Cooling System")
}
```
- Removing an element from list and adding (File : fun4.kt)
```kotlin
fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    shoppingList.remove("SSD")
    shoppingList.add("HDD")
    println(shoppingList)
}
```