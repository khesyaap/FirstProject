fun main(){
    persegi(8.0)
    persegiPanjang(7.0,7.0)
    jajarGenjang(8.0,3.0)
    layangLayang(12.0,24.0)
    trapesium(6.0,8.0,12.0)
    lingkaran(3.14,7.0,7.0)
    segitiga(8.0,10.0)
    belahKetupat(12.0,17.0)

}
fun belahKetupat(diagonal3 : Double, diagonal4 : Double) {
    val result = (diagonal3 * diagonal4) /2
    println("Luas Belah Ketupat adalah $result")
}
fun segitiga(alas : Double, tinggi : Double){
    val result = (alas * tinggi) /2
    println("Luas Segitiga adalah $result")
}
fun lingkaran(phi : Double, r1 : Double, r2 : Double) {
    val result = phi * r1 * r2
    println("Luas Lingkaran adalah $result")
}
fun trapesium(sisi_a : Double,sisi_b : Double, tinggi : Double){
    val result = ((sisi_a + sisi_b) * tinggi)/2
    println("Luas Trapesium adalah $result")
}

fun layangLayang(diagonal1 : Double, diagonal2 : Double){
    val result =( diagonal1 * diagonal2) /2
    println("Luas Layang Layang adalah $result")
}

fun jajarGenjang(alas : Double, tinggi : Double) {
    val result = alas * tinggi
    println("Luas Jajar Genjang adalah $result")
}

fun persegiPanjang(panjang : Double, lebar : Double) {
    val result = panjang * lebar
    println("Luas Persegi Panjang adalah $result")
}

fun persegi(sisi : Double) {
    val result = sisi * sisi
    println("Luas persegi adalah $result")
}
