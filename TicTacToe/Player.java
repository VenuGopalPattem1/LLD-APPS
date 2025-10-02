package TicTacToe;

public abstract class Player {
    protected String name;
    protected CellValue marker;
    public Player(String name,CellValue marker){
        this.name=name;
        this.marker=marker;
    }
    public String getName() {
        return name;
    }
    public CellValue getMarker() {
        return marker;
    }
    @Override
    public String toString() {
        return "Player [ name = "+ name +" Marker = "+marker+" ]";
    }
    public abstract Position getMove(Board b);
}
