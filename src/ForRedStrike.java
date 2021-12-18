public class ForRedStrike extends StrikeResult implements IStrikeResult {

    public ForRedStrike(CarromBoardForCleanStrike gameBoard ,int maxEmptyStrikesAllowed, int maxFoulsAllowed){
        super(gameBoard,maxEmptyStrikesAllowed,maxFoulsAllowed);
    }

    @Override
    public void updateResult(Player player) {
        player.setSuccessiveEmptyStrikesCountToNil();
        updatePoints(player,3);
        updateGameBoard(0,1);
    }
}
