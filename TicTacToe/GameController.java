package TicTacToe;

public class GameController {
    private Board b;
    private Player[] players;
    private int curr;
    private WinChecker winChecker;

    public GameController(Player a, Player b, WinChecker winChecker, int size) {
        players=new Player[2];
        players[0] = a;
        players[1] = b;
        this.winChecker = winChecker;
        this.b = new Board(size);
    }

    public void start() {
        b.printboard();
        while (true) {
            Player p = players[curr];
            Position pos = p.getMove(b);
            boolean flag = b.placeMove(pos, p.getMarker());
            if (!flag) {
                System.out.println("Invalid move, try again");
                continue;
            }
            b.printboard();
            CellValue cv = winChecker.checkWinner(b);
            if (cv != CellValue.EMPTY) {
                System.out.println("Winner: " + cv + " (" + p.getName() + ")");
                break;
            }
            if (b.isFull()) {
                System.out.println("Game is a draw.");
                break;
            }
            curr = 1 - curr;
        }
    }
}
