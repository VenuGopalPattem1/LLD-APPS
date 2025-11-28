package Atm;

public interface State {
    void insercard();
    void enterPin(int pin);
    void selectOp(String op);
    void withDraw(int val);
    void ejectCard();
}
