
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