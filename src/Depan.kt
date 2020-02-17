class Depan : ICallback {
    fun awal() {

        println("===============================")
        println("GAME SUIT TERMINAL VERSION")
        println("===============================")
        println("1. Masukkan pemain 1:")
        val userInput1 = readLine()
        println("2. Masukkan pemain 2:")
        val userInput2 = readLine()
        var options = listOf<String>("batu", "kertas", "gunting")
        if (options.contains(userInput1!!.toLowerCase())) {
            var syaratMain = GameSuit(this)
            if (userInput2 != null) {
                syaratMain.printResult(userInput1, userInput2)
            }
        } else {
            println("mohon input yang benar")

        }


    }

    override fun printResult(result: String) {
        println("Hasil:")
        println(result)
    }
}