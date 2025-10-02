package ParkingLot;

public class Bike extends Vehicle{

    public Bike(String num){
        super(num);
    }
    @Override
    public String getType() {
       return "bike";
    }
    
}
