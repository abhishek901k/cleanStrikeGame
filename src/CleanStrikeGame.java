public class CleanStrikeGame {
    private final Player player1;
    private final Player player2;
    private final Referee referee;
    private final Strike strike;
    private final Menu menu;

    private final int minimumPointsToWin = 5;
    private final int minimumPointsDifferenceToWin = 3;
    private boolean isWhiteTurn = true;

    public CleanStrikeGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        CarromBoardForCleanStrike gameBoard = new CarromBoardForCleanStrike();
        this.referee = new Referee(player1,player2, gameBoard, minimumPointsToWin, minimumPointsDifferenceToWin);
        this.strike = new Strike(gameBoard, player1, player2);
        this.menu = new Menu();
    }

    public void playGame(){
        menu.displayMenu();
        while(!isGameOver()){
            NextTurn();
        }
        referee.announceResult();
    }

    private boolean isGameOver(){
        return  (referee.isGameWon() || referee.isGameDraw());
    }

    public void NextTurn(){
        Player playerTurn = (isWhiteTurn) ? player1 : player2;
        strike.nextStrike(playerTurn);
        isWhiteTurn = !isWhiteTurn;
    }
}