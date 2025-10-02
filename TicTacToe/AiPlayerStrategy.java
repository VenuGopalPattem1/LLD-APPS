package TicTacToe;

public class AiPlayerStrategy extends Player{
     public AiPlayerStrategy(String name,CellValue marker){
        super(name,marker);
    }
    @Override
    public Position getMove(Board b) {
        int n=b.getSize();
         System.out.println(name + " (" + marker + ") - has done its move");
         System.out.println("---------------------------");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Position p=new Position(i, j);
                if(b.getCell(p).isEmpty()){
                    return p;
                }
            }
        }
        return null;
    }
}
