import java.util.HashMap;

public class StrikeStorage {

    private CarromBoardForCleanStrike gameBoard;
    private int maxEmptyStrikeAllowed;
    private int maxFoulAllowed;

    private HashMap<Integer, IStrikeResult> map;

    public StrikeStorage(CarromBoardForCleanStrike gameBoard ,int maxEmptyStrikesAllowed, int maxFoulsAllowed){
        map = new HashMap<>();
        this.gameBoard = gameBoard;
        this.maxEmptyStrikeAllowed = maxEmptyStrikesAllowed;
        this.maxFoulAllowed = maxFoulsAllowed;
        updateHashMap();
    }

    private void updateHashMap(){
        map.put(1,new ForStrike(gameBoard, maxEmptyStrikeAllowed ,maxFoulAllowed));
        map.put(2,new ForMultiStrike(gameBoard, maxEmptyStrikeAllowed ,maxFoulAllowed));
        map.put(3,new ForRedStrike(gameBoard, maxEmptyStrikeAllowed ,maxFoulAllowed));
        map.put(4,new ForStrikerStrike(gameBoard, maxEmptyStrikeAllowed ,maxFoulAllowed));
        map.put(5,new ForDefunctCoin(gameBoard, maxEmptyStrikeAllowed ,maxFoulAllowed));
        map.put(6,new ForEmptyStrike(gameBoard, maxEmptyStrikeAllowed ,maxFoulAllowed));
    }

    public IStrikeResult getStrike(int strikeMade){
        return map.get(strikeMade);
    }

    public int size() {
        return map.size();
    }
}
