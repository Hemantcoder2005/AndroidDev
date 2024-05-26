# Functions And Classes
## Functions
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

- Now move forward to make our coffee machine to address people with their names

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

