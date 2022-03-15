fun main(){
    val name = "Khesya"
    morning(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    evening(name)
    evening(name)
    evening(name)
    night(name)
    morning(name)
    goodbye(name)
    goodbye(name)
}


fun morning(name: String){
    println("Halo selamat pagi Khesya $name")
}
fun afternoon(name: String){
    println("Halo selamat siang Khesya $name")
}
fun evening(name: String){
    println("Halo selamat sore Khesya $name")
}
fun night(name: String){
    println("Halo selamat malam Khesya $name")
}
fun goodbye (name: String){
    println("Sampai jumpa Khesya $name")
}

