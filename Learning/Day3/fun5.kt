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