public class Referee {

    private final CarromBoardForCleanStrike gameBoard;
    private final Player player1;
    private final Player player2;

    private final int minimumPointsToWin;
    private final int minimumPointsDifferenceToWin;
    private String result = "";

    public Referee(Player player1, Player player2, CarromBoardForCleanStrike gameBoard,int minimumPointsToWin, int minimumPointsDifferenceToWin) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameBoard = gameBoard;
        this.minimumPointsToWin = minimumPointsToWin;
        this.minimumPointsDifferenceToWin = minimumPointsDifferenceToWin;
    }

    public void announceResult(){
        System.out.println(result);
    }

    // Updating Result if game won
    public boolean isGameWon(){

        Player minPointsPlayer = (player1.getPoint() <= player2.getPoint()) ? player1 : player2;
        Player maxPointsPlayer = (player1.getPoint() > player2.getPoint()) ? player1 : player2;

        int pointsDifference = maxPointsPlayer.getPoint() - minPointsPlayer.getPoint();

        if(( maxPointsPlayer.getPoint() >= minimumPointsToWin ) && ( pointsDifference >= minimumPointsDifferenceToWin )){
            result = maxPointsPlayer.getName() + " Won the game. Final Score: " + player1.getPoint() +"-"+ player2.getPoint();
            return true;
        }
        return false;
    }

    // Updating Result if game draw
    public boolean isGameDraw(){
        if(gameBoard.isBoardEmpty()){
            result = "Game Draw. Final Score: " + player1.getPoint() +"-"+ player2.getPoint();
            return true;
        }
        return false;
    }
}