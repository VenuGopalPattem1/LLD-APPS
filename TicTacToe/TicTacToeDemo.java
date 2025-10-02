package TicTacToe;

import java.util.Scanner;

public class TicTacToeDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Player h=new HumanPlayerStrategy("Venu", CellValue.X, sc);
        Player ai=new AiPlayerStrategy("bot", CellValue.O);
        GameController gc=new GameController(h, ai, new ThreeConWinChecker(), 3);
        gc.start();
        sc.close();

    }
}
