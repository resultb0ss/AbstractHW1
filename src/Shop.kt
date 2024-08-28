abstract class Shop {

    abstract fun open()
    abstract fun close()

    open fun infoToString(){
        println("Это магазин")
    }
}