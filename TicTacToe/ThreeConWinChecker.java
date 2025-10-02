package TicTacToe;

public class ThreeConWinChecker implements WinChecker {

    @Override
    public CellValue checkWinner(Board b) {
        int n=b.getSize();
        
        for (int i = 0; i < n; i++) {
            CellValue first = b.getCell(new Position(i, 0)).getVal();
            if (first == CellValue.EMPTY) continue;
            boolean allSame = true;
            for (int j = 1; j < n; j++) {
                if (b.getCell(new Position(i, j)).getVal() != first) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) return first;
        }

        // check columns
        for (int j = 0; j < n; j++) {
            CellValue first = b.getCell(new Position(0, j)).getVal();
            if (first == CellValue.EMPTY) continue;
            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (b.getCell(new Position(i, j)).getVal() != first) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) return first;
        }

        // check main diagonal
        CellValue first = b.getCell(new Position(0, 0)).getVal();
        if (first != CellValue.EMPTY) {
            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (b.getCell(new Position(i, i)).getVal() != first) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) return first;
        }

        // check anti-diagonal
        first = b.getCell(new Position(0, n - 1)).getVal();
        if (first != CellValue.EMPTY) {
            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (b.getCell(new Position(i, n - 1 - i)).getVal() != first) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) return first;
        }

        return CellValue.EMPTY;


        // int n=b.getSize();
        // for(int i=0;i<n;i++){
        //     Cell c=b.getCell(new Position(i, 0));
        //     if(c.getVal()==CellValue.EMPTY) continue;
        //     boolean con=true;
        //     for(int j=1;j<n;j++){
        //         if(b.getCell(new Position(i, j)).getVal()==CellValue.EMPTY){
        //             con=false;
        //             break;
        //         }
        //     }
        //     if(con) return c.getVal();
        // }
        // return null;
    }
    
}
