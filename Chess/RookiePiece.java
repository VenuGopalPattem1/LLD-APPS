package Chess;

public class RookiePiece extends Pieces {
    public RookiePiece(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "ROOKIEW" : "ROOKIEB";
    }

    @Override
    public boolean canMove( Board board, Spot start, Spot end) {
        // Implement rook movement logic here
        return true;
    }

    @Override
    public void move(  Board board, Spot start, Spot end) {
        // Implement rook move action here
    }
    
}
