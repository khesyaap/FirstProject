fun main(){
    val price = 3000000

    if (price >= 400000 && price < 800000) {
        val resultDiscount = price * (4/100)
        val finalPrice = price - resultDiscount
        print("Total pembayaran $finalPrice")

    }else if (price >= 800000 && price < 1600000) {
        val resultDiscount = 800000 * 9 / 100
        val finalprice = price - resultDiscount
        print("Total pembayaran $finalprice")

    } else if (price >= 1600000 && price < 2000000) {
        val resultDiscount = 1600000 * 19/100
        val finalprice = price - resultDiscount
        print("Total pembayaran $finalprice")

    }else if (price >= 2000000 && price < 3000000) {
        val resultDiscount = 2000000 * 25/100
        val finalprice = price - resultDiscount
        print("Total pembayaran $finalprice")

    } else (price >= 3000000)
        val resultDiscount = 3000000 * 40/100
        val finalprice = price - resultDiscount
        print("Total pembayaran $finalprice")
}