package Atm;

public class CardInsertedState implements State{
    AtmMachine atmMachine;

    public CardInsertedState(AtmMachine atm){
        atmMachine=atm;
    }

    @Override
    public void insercard() {
        System.out.println("card inserted");
    }

    @Override
    public void enterPin(int pin) {
        if(pin==atmMachine.correctPin){
            System.out.println("Authentication sucess");
            atmMachine.setState(atmMachine.authState);
        }else{
            System.out.println("Authentication failed");
            atmMachine.setState(atmMachine.idelState);
        }
    }

    @Override
    public void selectOp(String op) {
        System.out.println("enter pin first");

    }

    @Override
    public void withDraw(int val) {
        System.out.println("enter pin first");

    }

    @Override
    public void ejectCard() {
        System.out.println("card is rejected");
        atmMachine.setState(atmMachine.idelState);
    }

}
