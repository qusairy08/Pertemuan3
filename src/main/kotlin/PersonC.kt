package id.ac.polbeng.depandi.test_kelas

class PersonC (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    //deklarasi dan inisialisasi property dapat dilakukan hanya didalam parameter konstruktor utama
    val budi = PersonC("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}