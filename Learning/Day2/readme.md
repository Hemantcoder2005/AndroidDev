# Let's Learn Kotlin
## Variables
- Variables are temporary containers which contain INT,FLOAT,STRING,BOOL etc.
- It decleared once app is running and deleted when app is closed.
```
var userName = "Name" 
```
- where var is variable declearation.
- userName is name of variable.
- Name is a string dataType which is assigning to userName.


## DataType
Refer to this Page [Here](https://kotlinlang.org/docs/numbers.html)
- Integer
- Booleans
- Characters
- Strings
- Arrays

Please checkout all datatype in official docs!

If you want to run Kotlin online [Here](https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMi4wLjAiLCJwbGF0Zm9ybSI6ImphdmEiLCJhcmdzIjoiIiwibm9uZU1hcmtlcnMiOnRydWUsInRoZW1lIjoiaWRlYSIsImNvZGUiOiIvKipcbiAqIFlvdSBjYW4gZWRpdCwgcnVuLCBhbmQgc2hhcmUgdGhpcyBjb2RlLlxuICogcGxheS5rb3RsaW5sYW5nLm9yZ1xuICovXG5mdW4gbWFpbigpIHtcbiAgICBwcmludGxuKFwiSGVsbG8sIHdvcmxkISEhXCIpXG59In0=)

## Print
```Kotlin
fun main(){
    println("Hello world!")
}
```

## Val vs Var

let's say we have
```Kotlin
fun main(){
    val number1 = 1
    number1 = 2
}
```
```Kotlin number1=2``` will give error because we can't change value of number1 because we decleared it as val type. So we use var which means variable.
```Kotlin
fun main(){
    var number1 = 1
    number1 = 2
}
``` 
