package Atm;


public class AtmMachine {
    IdelState idelState;
    CardInsertedState cardInsertedState;
    AuthState authState;
    WithdrawState withdrawState;

    State state;

    double atmBalance = 10000;   // cash inside ATM
    int correctPin = 1234;

    public AtmMachine(){
        state=new IdelState(this);
        idelState=new IdelState(this);
        cardInsertedState=new CardInsertedState(this);
        authState=new AuthState(this);
        withdrawState=new WithdrawState(this);
    }

    void setState(State s){
        this.state=s;
    }

    void insertCard(){
        state.insercard();
    }
    
    void enterPin(int pin){
        state.enterPin(pin);
    }
    
    void selectOp(String op){
        state.selectOp(op);
    }

    void withDraw(int val){
        state.withDraw(val);
    }
}
