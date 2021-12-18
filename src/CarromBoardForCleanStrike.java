public class CarromBoardForCleanStrike extends CarromBoard{

    public CarromBoardForCleanStrike() {
        super(1,9,0,1);
    }

    public void decreaseRedCoinsOnBoardBy(int CoinsCount) {
        if(CoinsCount >= 0 )
            this.redCoinsCount -= CoinsCount;
    }

    public void decreaseBlackCoinsOnBoardBy(int CoinsCount) {
        if(CoinsCount >= 0 )
            this.blackCoinsCount -= CoinsCount;
    }
 
    public boolean isBoardEmpty(){
        return (redCoinsCount == 0 && blackCoinsCount == 0);
    }
}
