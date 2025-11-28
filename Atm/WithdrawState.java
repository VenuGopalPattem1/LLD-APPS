package Atm;

public class WithdrawState implements State{
    AtmMachine atmMachine;

    public WithdrawState(AtmMachine atm){
        atmMachine=atm;
    }

     @Override
    public void insercard() {
        System.out.println("card inserted");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Authentication sucess");
    }

    @Override
    public void selectOp(String op) {
        System.out.println("Operation selected");
    }

    @Override
    public void withDraw(int val) {
        if(val<atmMachine.atmBalance){
            System.out.println("Amount "+val+" has been withdrwan");
            atmMachine.atmBalance-=val;
            atmMachine.setState(atmMachine.idelState);
        }else{
            System.out.println("Insufficient ATM balance");
        }
        ejectCard();

    }

    @Override
    public void ejectCard() {
       System.out.println("card is ejected");
        atmMachine.setState(atmMachine.idelState);
    }
}
