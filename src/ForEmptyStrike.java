public class ForEmptyStrike extends StrikeResult implements IStrikeResult {

    public ForEmptyStrike(CarromBoardForCleanStrike gameBoard ,int maxEmptyStrikesAllowed, int maxFoulsAllowed){
        super(gameBoard,maxEmptyStrikesAllowed,maxFoulsAllowed);
    }

    @Override
    public void updateResult(Player player) {
        player.incrementSuccessiveEmptyStrike();
        if(player.getSuccessiveEmptyStrikesCount() == maxEmptyStrikesAllowed){
            player.decreasePointsBy(1);
            player.setSuccessiveEmptyStrikesCountToNil();
        }
    }
}
