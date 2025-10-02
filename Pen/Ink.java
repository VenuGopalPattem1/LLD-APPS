package Pen;

import java.util.ArrayList;
import java.util.List;
//state
public class Ink {
    private String color;
    private int quantity;
    List<IPenObserver> observer;

    public Ink(String color,int q){
        this.color=color;
        this.quantity=q;
        observer=new ArrayList<>();
    }

    public boolean useInk(int q){
        if(quantity<=0){
            notifyEmptyInk();
            return false;
        }
        quantity-=q;
        if(quantity<=10&&quantity>0){
            notifyLowInk();
        }
        // if(quantity<0) return false;
        return true;
    }

    public void add(IPenObserver ob){
        observer.add(ob);
    }

    public void remove(IPenObserver ob){
        observer.remove(ob);
    }

    private void notifyLowInk(){
        for(IPenObserver ob:observer){
            ob.lowInk(quantity);
        }
    }

    private void notifyEmptyInk(){
        for(IPenObserver ob:observer){
            ob.emptyInk();
        }
    }

    public String getColor() {
        return color;
    }
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Ink{color='" + color + "', quantity=" + quantity + "}";
    }
}
