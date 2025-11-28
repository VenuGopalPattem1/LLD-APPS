package Atm;

public class AuthState implements State{
    AtmMachine atmMachine;

    public AuthState(AtmMachine atm){
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
        if(op.equals("draw")){
            System.out.println("Operation selected");
            atmMachine.setState((atmMachine.withdrawState));
        }else{
             System.out.println("Operation failed");
            atmMachine.setState((atmMachine.idelState));
        }

    }

    @Override
    public void withDraw(int val) {
        System.out.println("select one Operation");


    }

    @Override
    public void ejectCard() {
       System.out.println("card is ejected");
        atmMachine.setState(atmMachine.idelState);
    }
}
