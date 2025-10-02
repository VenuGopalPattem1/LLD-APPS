package TicTacToe;

public class Board {
    private int n;
    private Cell[][] cell;

    public Board(int n) {
        this.n = n;
        cell = new Cell[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cell[i][j] = new Cell();
            }
        }
    }

    public boolean placeMove(Position p, CellValue val) {
        if (!isBound(p)) {
            return false;
        }
        Cell c = cell[p.x][p.y];
        if (!c.isEmpty()) {
            return false;
        }
        c.setVal(val);
        return true;
    }

    public boolean isBound(Position p) {
        if (p.x >= 0 && p.y >= 0 && p.x < n && p.y < n) {
            return true;
        }
        return false;
    }

    public Cell getCell(Position p) {
        return cell[p.x][p.y];
    }

    public boolean isFull() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cell[i][j].getVal() == CellValue.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getSize() {
        return n;
    }

    public void printboard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char symbol;
                switch (cell[i][j].getVal()) {
                    case X -> symbol = 'X';
                    case O -> symbol = 'O';
                    default -> symbol = '-';
                }
                System.out.print(" " + symbol + " ");
                if (j < n - 1)
                    System.out.print("|"); // column divider
            }
            System.out.println();
            if (i < n - 1) {
                // row divider
                for (int k = 0; k < n; k++) {
                    System.out.print("---");
                    if (k < n - 1)
                        System.out.print("+");
                }
                System.out.println();
            }
        }
    }

}
