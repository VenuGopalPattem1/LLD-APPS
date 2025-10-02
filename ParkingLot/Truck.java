package ParkingLot;

public class Truck extends Vehicle{

    public Truck(String num) {
        super(num);
    }

    @Override
    public String getType() {
        return "truck";
    }
    
}
