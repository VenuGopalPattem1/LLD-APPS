package Chess;

public abstract class Pieces {
    private boolean isWhite;
    private boolean isKilled;

    public Pieces(boolean isWhite) {
        this.isWhite = isWhite;
        this.isKilled = false;
    }
    public boolean isWhite() {
        return isWhite;
    }
    public boolean isKilled() {
        return isKilled;
    }
    public abstract String getSymbol();
    public abstract boolean canMove(Board board, Spot start, Spot end);
    public abstract void move(Board board, Spot start, Spot end);
}
