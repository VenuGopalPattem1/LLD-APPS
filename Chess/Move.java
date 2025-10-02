package Chess;

public class Move {
    private Player player;
    private Spot start;
    private Spot end;
    private Pieces pieceMoved;
    private Pieces pieceKilled;
    public Move(Player player, Spot start, Spot end,Pieces pieces) {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = pieces;
        this.pieceKilled = null;
    }

    public Player getPlayer() {
        return player;
    }
    public Spot getStart() {
        return start;
    }
    public Spot getEnd() {
        return end;
    }
    public Pieces getPieceMoved() {
        return pieceMoved;
    }
    public Pieces getPieceKilled() {
        return pieceKilled;
    }
}
