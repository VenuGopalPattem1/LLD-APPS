package TicTacToe;

public class Cell {
    private CellValue val;
    public Cell(){
        val=CellValue.EMPTY;
    }
    public boolean isEmpty(){
        return val==CellValue.EMPTY;
    }
    public void setVal(CellValue val) {
        this.val = val;
    }
    public CellValue getVal() {
        return val;
    }
}
