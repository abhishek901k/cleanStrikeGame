import java.util.Scanner;

public class Strike{
    private final Player player1;
    private final Player player2;
    private final StrikeStorage storage;

    Scanner scanner = new Scanner(System.in);

    public Strike(CarromBoardForCleanStrike gameBoard, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.storage = new StrikeStorage(gameBoard,3,3);
    }

    public void nextStrike(Player playerTurn){
        printCurrentPlayerName(playerTurn);

        int strikeMade = strikeMade();
        strikeResultsForStrikeMade(playerTurn,strikeMade);

        printCurrentScore();
    }

    public int strikeMade(){
        int strikeMade = scanner.nextInt();

        while (strikeMade<0 && strikeMade>storage.size()){
            System.out.println("Please Enter A Valid Strike");
            strikeMade = strikeMade();
        }
        return strikeMade;
    }

    public void strikeResultsForStrikeMade(Player player, int strikeMade){
        IStrikeResult strike = storage.getStrike(strikeMade);
        strike.updateResult(player);
    }

    private void printCurrentPlayerName(Player playerTurn){
        System.out.println("Turn : " + playerTurn.getName());
    }

    private void printCurrentScore(){
        System.out.println("Current Score : " + player1.getPoint() + " : " + player2.getPoint());
        System.out.println("*******************************************************************************");
    }
}