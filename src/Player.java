public class Player {

    private String name;
    private int point;
    private int foulCounts;
    private int successiveEmptyStrikes;

    public Player(String name, int point, int foulCounts, int successiveEmptyStrikes) {
        this.name = name;
        this.point = point;
        this.foulCounts = foulCounts;
        this.successiveEmptyStrikes = successiveEmptyStrikes;
    }

    public Player(String name) {
        this(name,0,0,0);
    }

    public String getName(){
        return name;
    }

    public int getPoint() {
        return point;
    }

    public void decreasePointsBy(int point) {
        if(point>0)
            this.point -= point;
    }

    public void increasePointsBy(int point) {
        if(point>0)
            this.point += point;
    }

    public int getFoulCounts(){
        return foulCounts;
    }

    public void incrementFoulCounts(){
        foulCounts += 1;
    }

    public void setFoulCountsToNil(){
        foulCounts = 0;
    }

    public int getSuccessiveEmptyStrikesCount() {
        return successiveEmptyStrikes;
    }

    public void incrementSuccessiveEmptyStrike(){
        successiveEmptyStrikes +=1 ;
    }

    public void setSuccessiveEmptyStrikesCountToNil() {
        successiveEmptyStrikes = 0;
    }
}