package Chess;

public class QueenPiece extends Pieces {
    public QueenPiece(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "QUEENW " : "QUEENB ";
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // Implement logic to determine if the queen can move
        return true;
    }

    @Override
    public void move(Board board, Spot start, Spot end) {
        // Implement logic to move the queen
    }
    
}
