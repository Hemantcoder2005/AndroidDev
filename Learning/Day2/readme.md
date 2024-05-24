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
```number1=2``` will give error because we can't change value of number1 because we decleared it as val type. So we use var which means variable.
```Kotlin
fun main(){
    var number1 = 1
    number1 = 2
}
``` 
Conclusion:
- val : Is mutable
- var : Is immutable

## Specifying the type manually
```kotlin
fun main(){
    var myAge : Byte = 35
    println(myAge)
}
```
So we can change the type variable like above code.

##  If Else Statements
```kotlin
fun main(){
    if(true){
        println("true is printed")
    }else{
        println("false is printed")
    }
}
```

## Readln and toInt
```kotlin
fun main(){
   var age = readln().toInt()
}
```
In above code we are declearing age as variable and Taking input ```readln()``` by default we get String.But for age we have to convert into int by ```toInt()```

## Else if and the in keyword
```kotlin
fun main(){
   var age = readln().toInt()

   if (age >= 50){
        println("You are too old for club Go home ")
   }else if(age >= 18){
    println("You are Welcome to club")
   }else{
    println("Go home parents are waiting!")
   }
}
```

# Let's Make a Game
## Rock-Paper-Scissors Game
A simple command-line Rock-Paper-Scissors game implemented in Kotlin. Play against the computer and see if you can win!
## Rules
- Rock beats scissors.
- Scissors beat paper.
- Paper beats rock.
```kotlin
fun getName(choice: Int): String {
    return when (choice) {
        1 -> "rock"
        2 -> "paper"
        3 -> "scissor"
        else -> "unknown"
    }
}
fun main(){
    println("Enter the number of games do you want to play : ")
    var NumberOfGames= readln().toInt()
    var playerChoice = -1
    var computerChoice = -1
    var games=0
    var win=0
    while(games<NumberOfGames){
        computerChoice = (1..3).random()
        println("------------Menu--------------")
        println("1 : rock")
        println("2 : paper")
        println("3 : scissor")
        println("------------------------------")
        println("Select your Choice from (1-3)")
        playerChoice= readln().toInt()
        if (playerChoice  !in (1..3)){
            println("Please select correct choice from 1-3 ")
        }
        var comp_str_choice =getName(computerChoice)
        var player_str_choice =getName(playerChoice)
        println("Computer Choice: $comp_str_choice")
        println("Your choice: $player_str_choice")
        if(computerChoice == playerChoice){
            println("Draw!")
        }else{
            
            if ((computerChoice == 1 && playerChoice == 2) || (computerChoice == 3 && playerChoice == 1) || (computerChoice == 2 || playerChoice == 3) ){
                println("You win")
                win++
            }else{
                println("You lose ")
            }
            games++
        }
    }
    println("--------------------Final Score------------------")
    if(win == NumberOfGames-win){
        println("Draw!📍📍📍")
    }else if(win>NumberOfGames - win){
        print("You Win!🎉🎉🎉🎉")
    }else{
        print("You lose!😒😒😒😒")
    }
    
}
```

## Function getName(choice: Int): String:
- This function takes an integer choice as an argument and returns a corresponding string (either “rock,” “paper,” “scissor,” or “unknown”) based on the value of choice.
- It uses a when expression (similar to a switch statement in other languages) to handle different cases:
- - If choice is 1, it returns “rock.”
- - If choice is 2, it returns “paper.”
- - If choice is 3, it returns “scissor.”
- - Otherwise (if choice is not 1, 2, or 3), it returns “unknown.”

## Main Function:
- The main() function is the entry point of your program.
- It prompts the user to enter the number of games they want to play (NumberOfGames).
- It initializes variables:
- - playerChoice and computerChoice to -1 (initial values).
- - games to 0 (initial number of games played).
- - win to 0 (initial number of wins).
- It enters a while loop that continues until the number of games played (games) reaches the specified NumberOfGames.
- Inside the loop:
- The computer randomly selects its choice (computerChoice).
- The user is presented with a menu to select their choice (rock, paper, or scissors).
- If the user’s choice is not within the range 1 to 3, an error message is displayed.
- The game outcome (win/lose/draw) is determined based on the rules of Rock-Paper-Scissors.
- The game count (games) is incremented.
- If the user wins, the win count is incremented.
- After all games are played, the final score is displayed:
- If the user and computer have the same number of wins, it’s a draw.
- If the user has more wins than losses, the user wins.
- Otherwise, the user loses.