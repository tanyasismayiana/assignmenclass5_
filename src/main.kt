fun main(){
    var student = Human("jogh",20,50)
    student.eat(24)
    println(student.weight)
    student.speak("dream girl!")
    student.birthday()
    var girl =User("Tanyasis","Mayiana","tanya@code","0718777705","love254")
    println(girl.email)
    println(girl.firstName)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
    weight +=foodWeight
        println("I am eating $foodWeight kgs of food")
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age +=1
        println(age)
    }
}
data class User(var firstName:String,var lastName:String, var email:String,var phoneNumber:String,var password:String)