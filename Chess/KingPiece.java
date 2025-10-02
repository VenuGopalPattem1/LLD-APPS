package Chess;

public class KingPiece extends Pieces {
    public KingPiece(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "KINGW  " : "KINGB  ";
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // Implement logic to determine if the king can move
        return true;
    }

    @Override
    public void move(Board board, Spot start, Spot end) {
        // Implement logic to move the king
    }
    
}
