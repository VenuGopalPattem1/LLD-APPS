package Chess;

import java.util.Scanner;

public class ChessDemo {
    public static void main(String[] args) {
        Player player1 = new Player(true, "Alice");
        Player player2 = new Player(false, "Bob");
        Game game = new Game(player1, player2);

        Player currPlayer=player1;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            game.displayBoard();
                System.out.println("-----------------------------------------------");

            System.out.println("Please enter start spot:");

            String start = scanner.next();
            if (start.equals("q")) {
                System.out.println("GAME OVER");
                System.out.println("-----------------------------------------------");
                break;
            } else if (start.equals("u")) {
                game.undo();
                continue;
            }

            System.out.println("Please enter end spot:");
            String end = scanner.next();
            if (end.equals("q")) {
                System.out.println("GAME OVER");
                System.out.println("-----------------------------------------------");
                break;
            }

            if (game.move(start, end)) {
                if (currPlayer == player1)
                    currPlayer = player2;
                else
                    currPlayer = player1;
                System.out.println("-----------------------------------------------");
                System.out.println("It is " + currPlayer.getName() + "'s turn now");
                System.out.println("-----------------------------------------------");

            }
        }  scanner.close();
    }
    
    }
