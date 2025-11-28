package Atm;

public class Main {
    public static void main(String[] args) {
        AtmMachine atm=new AtmMachine();
        atm.insertCard();
        atm.enterPin(1234);
        atm.selectOp("draw");
        atm.withDraw(1000010);
    }
}
