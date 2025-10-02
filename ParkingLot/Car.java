package ParkingLot;

public class Car extends Vehicle {

    public Car(String num) {
        super(num);
    }
    @Override
    public String getType() {
        return "car";
    }
    
}
