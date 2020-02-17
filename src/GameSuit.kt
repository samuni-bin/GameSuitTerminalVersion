class GameSuit(val iCallback: ICallback) {
    fun printResult(player1Choice: String, player2Choice: String) {

        if (player1Choice == player2Choice) iCallback.printResult("Draw!")
        else if ((player1Choice == "batu" && player2Choice == "gunting") ||
            (player1Choice == "kertas" && player2Choice == "batu") ||
            (player1Choice == "gunting" && player2Choice == "kertas")
        ) iCallback.printResult("Pemain 1 MENANG!")
        else iCallback.printResult("Pemain 2 MENANG!")

    }


}