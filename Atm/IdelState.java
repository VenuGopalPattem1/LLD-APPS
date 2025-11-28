package Atm;

public class IdelState implements State {

    AtmMachine atmMachine;

    public IdelState(AtmMachine atm){
        atmMachine=atm;
    }

    @Override
    public void insercard() {
        System.out.println("card inserted");
        atmMachine.setState(atmMachine.cardInsertedState);
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("card not inserted");
    }

    @Override
    public void selectOp(String op) {
        System.out.println("card not inserted");

    }

    @Override
    public void withDraw(int val) {
        System.out.println("card not inserted");

    }

    @Override
    public void ejectCard() {
        System.out.println("card not inserted");
    }

    
}
