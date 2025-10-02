package Chess;

public class Spot {
    private Pieces piece;;
    private int x;
    private int y;
    public Spot(Pieces piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }
    public Pieces getPiece() {
        return this.piece;
    }
    public void setPiece(Pieces piece) {
        this.piece = piece;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

}
