package TicTacToe;

import java.util.Scanner;

public class HumanPlayerStrategy extends Player {

    private Scanner sc;

    public HumanPlayerStrategy(String name, CellValue marker, Scanner sc) {
        super(name, marker);
        this.sc = sc;
    }

    @Override
    public Position getMove(Board board) {
        while (true) {
            System.out.print(name + " (" + marker + ") - enter row col: ");
            try {
                int r = sc.nextInt();
                int c = sc.nextInt();
                Position p = new Position(r-1, c-1);
                if (!board.isBound(p)) {
                    System.out.println("Out of bounds");
                    continue;
                }
                if (!board.getCell(p).isEmpty()) {
                    System.out.println("Cell occupied");
                    continue;
                }
                return p;
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                sc.nextLine();
            }
        }
    }

}
