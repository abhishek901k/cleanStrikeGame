public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        CleanStrikeGame cleanStrikeGame = new CleanStrikeGame(player1, player2);

        cleanStrikeGame.playGame();
    }
}
