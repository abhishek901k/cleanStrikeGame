public class ForStrike extends StrikeResult implements IStrikeResult {

    public ForStrike(CarromBoardForCleanStrike gameBoard ,int maxEmptyStrikesAllowed, int maxFoulsAllowed){
        super(gameBoard,maxEmptyStrikesAllowed,maxFoulsAllowed);
    }

    @Override
    public void updateResult(Player player) {
        player.setSuccessiveEmptyStrikesCountToNil();
        updatePoints(player,1);
        updateGameBoard(1,0);
    }
}
