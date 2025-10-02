package Chess;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private Player[] players=new Player[2];
    private Player currentTurn;
    private List<Move> movesPlayed=new ArrayList<>();
    private int idx;
    public Game(Player player1, Player player2) {
        this.players[0] = player1;
        this.players[1] = player2;
        this.currentTurn = players[0];
        this.board = new Board();
        this.idx=0;
    }
    public void displayBoard() {
        board.printBoard();
    }
    public List<Integer> getSpotPositions(String spot) {
        // Convert positions like "A1" to (row, col) indices
        int col = spot.charAt(0) - 'A';
        int row = 8 - Character.getNumericValue(spot.charAt(1));
        return List.of(row, col);
    }

    public boolean move(String start, String end) {
        List<Integer> startPos = getSpotPositions(start);
        List<Integer> endPos = getSpotPositions(end);
        Spot startSpot = board.getBox(startPos.get(0), startPos.get(1));
        Spot endSpot = board.getBox(endPos.get(0), endPos.get(1));

        Pieces piece = startSpot.getPiece();

        if (piece.canMove(board, startSpot, endSpot)) {
            piece.move(board, startSpot, endSpot);
            startSpot.setPiece(null);
            endSpot.setPiece(piece);
            idx++;
        }
        movesPlayed.add(new Move(currentTurn, startSpot, endSpot, piece));
        board.printBoard();
        return true;
    }

    public void undo(){
        if(idx>0){
            Move lastMove=movesPlayed.get(idx-1);
            Spot start=lastMove.getStart();
            Spot end=lastMove.getEnd();
            Pieces piece=end.getPiece();
            start.setPiece(piece);
            end.setPiece(null);
            idx--;
            board.printBoard();
        }
    }

    public void redo(){
        if(idx<movesPlayed.size())
        {
            Move nextMove=movesPlayed.get(idx);
            Spot start=nextMove.getStart();
            Spot end=nextMove.getEnd();
            Pieces piece=start.getPiece();
            end.setPiece(piece);
            start.setPiece(null);
            board.printBoard();
        }
        idx++;
    }
}
