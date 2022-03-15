import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    println("Masukkan bilangan pertama : ")
    val number = reader.nextInt()

    if (number < 0){
        print("Negative")
    }else{
        print("Positive")
    }
}