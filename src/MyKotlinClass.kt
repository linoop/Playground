import kotlin.reflect.KProperty

fun main() {
    val myKotlin = MyKotlinClass()
    myKotlin.name = "Linoop"
    myKotlin.printDetails()
}

class MyKotlinClass {
    var name: String by MyDelegation()

    fun printDetails(){
        println(name)
    }
}
class MyDelegation {
    var name = ""
    operator fun getValue(myKotlinClass: MyKotlinClass, property: KProperty<*>): String {
        return "getValue invoked $name"
    }
    operator fun setValue(myKotlinClass: MyKotlinClass, property: KProperty<*>, value: String){
       name = "New value $value"
    }

}