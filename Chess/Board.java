package Chess;

public class Board {
    private Spot[][] box=new Spot[8][8];

    public Board(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                box[i][j]=null;
            }
        }
        resetBoard();
    }


    public Spot getBox(int x,int y){
        return box[x][y];
    }
    public void resetBoard(){
        //initialize white pieces
        box[0][0]=new Spot(new RookiePiece(true),0,0);
        box[0][1]=new Spot(new KnightPiece(true),0,1);
        box[0][2]=new Spot(new BishopPiece(true),0,2);
        box[0][3]=new Spot(new QueenPiece(true),0,3);
        box[0][4]=new Spot(new KingPiece(true),0,4);
        box[0][5]=new Spot(new BishopPiece(true),0,5);
        box[0][6]=new Spot(new KnightPiece(true),0,6);
        box[0][7]=new Spot(new RookiePiece(true),0,7);
        for(int j=0;j<8;j++){
            box[1][j]=new Spot(new PawnPiece(true),1,j);
        }

        //initialize black pieces
        box[7][0]=new Spot(new RookiePiece(false),7,0);
        box[7][1]=new Spot(new KnightPiece(false),7,1);
        box[7][2]=new Spot(new BishopPiece(false),7,2);
        box[7][3]=new Spot(new QueenPiece(false),7,3);
        box[7][4]=new Spot(new KingPiece(false),7,4);
        box[7][5]=new Spot(new BishopPiece(false),7,5);
        box[7][6]=new Spot(new KnightPiece(false),7,6);
        box[7][7]=new Spot(new RookiePiece(false),7,7);
        for(int j=0;j<8;j++){
            box[6][j]=new Spot(new PawnPiece(false),6,j);
        }

        for(int i=2;i<6;i++){
            for(int j=0;j<8;j++){
                box[i][j]=new Spot(null,i,j);
            }
        }
    }

    public void printBoard(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(box[i][j].getPiece()==null){
                    System.out.print("-       ");
                }
                else{
                    System.out.print(box[i][j].getPiece().getSymbol()+" ");
                }
            }
            System.out.println();
        }
    }
}
