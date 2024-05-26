# Functions And Classes
## Functions
### Introduction
- let's create a function we use ```fun <name_of_function> ``` fun stands for function then  we have to write name of function.
- Let's see example (File: fun1.kt)
```kotlin
fun getCoffee(){
    println("Buy Beans.")
    println("Grind Beans.")
    println("Heat water to 90C.")
    println("Add Water.")
    println("Push water through grind beans.")
}
fun main(){
    getCoffee()
}
``` 
- - We are calling getCoffee() in main function.

- let's create coffee machine with function name ```makeCoffee()``
- First we will accept the sugarCount (eg: 0,1,2,3....)
```kotlin
fun main(){
    makeCoffee(-1)
    makeCoffee(0)
    makeCoffee(1)
    makeCoffee(4)
}
fun makeCoffee(sugarCount : Int){
    if(sugarCount < 0  ){
        println("Invalid sugar count.")
    }
    else if (sugarCount <= 1  ){
        println("Coffee with 1 spoon of sugar")
    }else{
        println("Coffee with $sugarCount spoons of sugar")
    
}
}
```

- Now move forward to make our coffee machine to address people with their names (File : fun3.kt)

```kotlin
fun main(){
    var name = "Joe"
    makeCoffee(-1,name)
    makeCoffee(0,name)
    makeCoffee(1,name)
    makeCoffee(4,name)
    makeCoffee(5,"")
}
fun makeCoffee(sugarCount : Int ,name : String ){
    var mssg=""
    if(sugarCount < 0  ){
        println("Invalid sugar count.")
        return
    }
    else if (sugarCount <= 1  ){
        mssg += "Coffee with $sugarCount spoon of sugar"
    }else{
        mssg += "Coffee with $sugarCount spoons of sugar"
    }

    if (name == ""){
        println("Please Enter the Name Properly!")
        return
    }
    else{
        mssg += " for $name"
    }
    println(mssg)
}
```

- You can Explore with input sugar and name.

### Let's function to return some thing!
- let's build basic function to sum two number and the it will return (File : fun4.kt)
```kotlin
fun main(){
    var sum = getsum(1,2)
    println(sum)
}
fun getsum(a : Int , b : Int) : Int{
    return a+b
}
```
- So we have to decleare what is the datatype of arguments(like a and b in this case) and we also we have to decleare what type of datType will retuen from function (like in this case it is a Integer).

- Go and explore and try to make calculator take inputs from user and print it.

## Classes
### Creating First Classes
- classes uses ```class``` in kotlin
- let say we have class name dog
```kotlin
class Dog(name : String , color : String){
    init {
        bark(name)
    }
    fun bark(name : String){
        println("$name says Woof! Woof!")
    }
}
fun main(){
    var name = "Daisy"
    var color = "Black"
    var daisy = Dog(name,color)
}
```
- When we call class Dog then  init function in Dog get executed for basic setup written in init.
- In this case dog bark on declearing in main function
