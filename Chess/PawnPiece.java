package Chess;

public class PawnPiece  extends Pieces {
    public PawnPiece(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "PAWNW  " : "PAWNB  ";
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // Implement logic to determine if the pawn can move
        return true;
    }

    @Override
    public void move(Board board, Spot start, Spot end) {
        // Implement logic to move the pawn
    }
    
}
