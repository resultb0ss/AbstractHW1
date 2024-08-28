class Magnit: Shop() {

    override fun open() {

        println("Магнит работает с 9 00")

    }

    override fun close() {
        println("Магнит закрывается в 21 00")
    }

    override fun infoToString() {
        println("Это магазин Магнит")
    }
}