public class ForStrikerStrike extends StrikeResult implements IStrikeResult {

    public ForStrikerStrike(CarromBoardForCleanStrike gameBoard ,int maxEmptyStrikesAllowed, int maxFoulsAllowed){
        super(gameBoard,maxEmptyStrikesAllowed,maxFoulsAllowed);
    }

    @Override
    public void updateResult(Player player) {
        player.setSuccessiveEmptyStrikesCountToNil();
        updatePoints(player,-2);
        updateGameBoard(1,0);
    }
}
