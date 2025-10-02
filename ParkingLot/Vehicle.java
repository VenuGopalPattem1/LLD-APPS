package ParkingLot;

public abstract class Vehicle {
    private String number;
    public Vehicle(String num){
        number=num;
    }
    public String getNumber() {
        return number;
    }
    public abstract String getType();
}
