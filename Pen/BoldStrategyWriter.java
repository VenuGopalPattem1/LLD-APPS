package Pen;

public class BoldStrategyWriter implements StartegyWritin{

    @Override
    public void write(String text,Ink ink,Nip nip) {
        if(ink.useInk(5)){
            System.out.println(" writing Bold using ink "+ink+" ans using nib of "+nip +" --> "+text);
        }else{
            System.out.println(" Some error occured in pen ");
        }
    }
    
}
