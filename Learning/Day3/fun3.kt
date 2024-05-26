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