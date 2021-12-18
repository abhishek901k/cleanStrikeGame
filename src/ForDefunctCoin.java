public class ForDefunctCoin extends StrikeResult implements IStrikeResult {

    public ForDefunctCoin(CarromBoardForCleanStrike gameBoard ,int maxEmptyStrikesAllowed, int maxFoulsAllowed){
        super(gameBoard,maxEmptyStrikesAllowed,maxFoulsAllowed);
    }

    @Override
    public void updateResult(Player player) {
        player.setSuccessiveEmptyStrikesCountToNil();
        updatePoints(player,-2);
        updateGameBoard(1,0);
    }
}
