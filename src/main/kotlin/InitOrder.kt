package id.ac.polbeng.depandi.test_kelas

class InitOrder(name: String){
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondproperty = "Secon property: ${name.length}".also(::println)
    init {
        println("Secon inilializer block that prints ${name.length}")
    }
}

fun main(){
    val initOrder= InitOrder("RPL")
}