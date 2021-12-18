public class ForMultiStrike extends StrikeResult implements IStrikeResult {

    public ForMultiStrike(CarromBoardForCleanStrike gameBoard ,int maxEmptyStrikesAllowed, int maxFoulsAllowed){
        super(gameBoard,maxEmptyStrikesAllowed,maxFoulsAllowed);
    }

    @Override
    public void updateResult(Player player) {
        player.setSuccessiveEmptyStrikesCountToNil();
        updatePoints(player,2);
        updateGameBoard(2,0);
    }
}
