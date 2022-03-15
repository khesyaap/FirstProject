fun main() {
// Tugas : Persegi, persegi panjang, jajar genjang, layang - layang, trapesium, lingkaran, segitiga, belah ketupat
    val bil1 = 3
    val bil2 = 5
    val radius = 18
    val sisi = 4
    val p = 2
    val l = 8
    val a = 5
    val t = 7
    val d1 = 3
    val d2 = 6
    val b = 4
    val c = 6
    val r = 2
    val w = 8
    val y = 6
    //Penjumlahan
    val result1 = bil1 + bil2
    //Pengurangan
    val result2 = bil2 - bil1
    //Perkalian
    val result3 = bil1 * bil2
    //Pembagian
    val result4 : Double  = bil2.toDouble() / bil1.toDouble()
    val luaslingkaran : Double = 3.14 * (radius.toDouble() * radius.toDouble())
    val luaspersegi = sisi * sisi
    val luaspersegipanjang = p * l
    val luasjajargenjang = a * t
    val luaslayanglayang = d1 * d2 /2
    val luastrapesium = (b + c) * r /2
    val luassegitiga = w * y /2
    val luasbelahketupat = d1 * d2 /2
    println("Hasil operasi aritmatika antara bilangan 1 dan 2 " +
            "adalah sbb\nPenjumlahan $result1 \nPengurangan  $result2 \n" +
            "Perkalian $result3 \nPembagian $result4 \nLuas Lingkaran $luaslingkaran" +
            " \nluaspersegi $luaspersegi \nluaspersegipanjang $luaspersegipanjang" +
            " \nluasjajargenjang $luasjajargenjang \nluaslayanglayang $luaslayanglayang " +
            "\nluastrapesium $luastrapesium \nluassegitiga $luassegitiga \nluasbelahketupat $luasbelahketupat")
}
