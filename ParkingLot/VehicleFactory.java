package ParkingLot;

public class VehicleFactory {
    public static Vehicle getInstance(String type, String number){
        switch (type) {
            case "car":
                return new Car(number);
            case "bike":
                return new Bike(number);
            case "truck":
                return new Truck(number);
            default:
                return null;
        }
    }
}
