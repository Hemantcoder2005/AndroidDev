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