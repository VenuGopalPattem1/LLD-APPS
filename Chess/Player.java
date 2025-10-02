package Chess;

public class Player {
    private boolean isWhite;
    private String name;
    private boolean isHuman;
    public Player(boolean isWhite, String name) {
        this.isWhite = isWhite;
        this.name = name;
        this.isHuman = true;
    }
    public boolean isWhite() {
        return isWhite;
    }
    public String getName() {
        return name;
    }
    public boolean isHuman() {
        return isHuman;
    }
}
