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
- Index in List (File : fun5.kt)
```kotlin
fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    shoppingList.removeAt(0) // Removing at index 0
    println(shoppingList)
}
```
- - So we are removing element at index 0 from our shoppingList.So we can see SSD is removing
- Adding Element At specific position (File : fun6.kt)
```kotlin
fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    shoppingList.add(0 , "HDD") 
    println(shoppingList)
}
```
```
[HDD, SSD, RAM, MotherBoard, Processor, GPU]
```
- - So we are giving index like 0 and inserting "HDD" overthere So overall indexing will change.
- Modifying a list (File : fun7.kt)
```kotlin
fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    shoppingList[0] = "HDD" 
    println(shoppingList)
}
```
```
OUTPUT : 
[HDD, RAM, MotherBoard, Processor, GPU]
```
-  Check a element exist in List or not (File : fun8.kt)
```kotlin
fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    println(shoppingList.contains("RAM"))
}
```
We will get bool value in this case we get true.
- Looping List (File : fun9.kt)
```kotlin
fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    for (i in shoppingList){
        println(i)
    }
}
```
- Looping List with Index
```kotlin
fun main(){
    val shoppingList =  mutableListOf("SSD" , "RAM", "MotherBoard" , "Processor" , "GPU" )
    for( i in 0  until  shoppingList.size){
        println(shoppingList[i])
    }
}
```
