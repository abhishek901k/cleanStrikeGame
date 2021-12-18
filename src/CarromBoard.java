public abstract class CarromBoard {

    protected int redCoinsCount;
    protected int blackCoinsCount;
    protected int whiteCoinsCount;
    protected int strikerCoinsCount;

    public CarromBoard(int redCoinsCount, int blackCoinsCount, int whiteCoinsCount, int strikerCoinsCount) {
        this.redCoinsCount = redCoinsCount;
        this.blackCoinsCount = blackCoinsCount;
        this.whiteCoinsCount = whiteCoinsCount;
        this.strikerCoinsCount = strikerCoinsCount;
    }
}
