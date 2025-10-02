package Chess;

public class BishopPiece extends Pieces {
    
    public BishopPiece(boolean isWhite) {
        super(isWhite);
    }

    public String getSymbol() {
        return isWhite() ? "BISHOPW" : "BISHOPB";
    }

    public boolean canMove(Board board, Spot start, Spot end) {
        // Bishops move diagonally any number of squares
        // int rowDiff = Math.abs(start.getRow() - end.getRow());
        // int colDiff = Math.abs(start.getCol() - end.getCol());
        // return rowDiff == colDiff;
        return true;
    }

    public void move(Board board, Spot start, Spot end) {
        // if (canMove(board, start, end)) {
        //     // Move the piece
        //     end.setPiece(start.getPiece());
        //     start.setPiece(null);
        // }
    }

}
