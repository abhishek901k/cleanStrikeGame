public class StrikeResult {

    protected final CarromBoardForCleanStrike gameBoard;
    protected final int maxEmptyStrikesAllowed;
    protected final int maxFoulsAllowed ;

    public StrikeResult(CarromBoardForCleanStrike gameBoard, int maxEmptyStrikesAllowed, int maxFoulsAllowed) {
        this.gameBoard = gameBoard;
        this.maxEmptyStrikesAllowed = maxEmptyStrikesAllowed;
        this.maxFoulsAllowed = maxFoulsAllowed;
    }

    // If decrease in points then foul handling
    protected void updatePoints(Player player, int points){
        if(points > 0) {
            player.increasePointsBy(points);
            return;
        }
        player.decreasePointsBy(points);
        FoulHandling(player);
    }

    private void FoulHandling(Player player){
        player.incrementFoulCounts();
        if(player.getFoulCounts() == maxFoulsAllowed){
            player.setFoulCountsToNil();
        }
    }

    protected void updateGameBoard(int decreaseBlackCoins, int decreaseRedCoins){
        gameBoard.decreaseBlackCoinsOnBoardBy(decreaseBlackCoins);
        gameBoard.decreaseRedCoinsOnBoardBy(decreaseRedCoins);
    }
}