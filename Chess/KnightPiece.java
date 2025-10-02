package Chess;

public class KnightPiece extends Pieces {
    public KnightPiece(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "KNIGHTW" : "KNIGHTB";
    }

    @Override
    public boolean canMove( Board board, Spot start, Spot end) {
        // Implement knight-specific movement logic here
        return true;
    }

    @Override
    public void move( Board board, Spot start, Spot end) {
        // Implement knight-specific move execution logic here
    }
    
}
