package ParkingLot;

public class ParkingLotDemo {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot lot = ParkingLot.getInstance(3, new NearestFirstStrategy());

        Vehicle v1 = VehicleFactory.getInstance("car", "KA-01-1111");
        Vehicle v2 = VehicleFactory.getInstance("bike", "KA-01-2222");
        Vehicle v3 = VehicleFactory.getInstance("truck", "KA-01-3333");
        Vehicle v4 = VehicleFactory.getInstance("car", "KA-01-4444");

        lot.parkVehicle(v1);
        lot.parkVehicle(v2);
        lot.parkVehicle(v3);
        lot.parkVehicle(v4); // no free slot

        Thread.sleep(1000);

        lot.leaveSlot(2, new CredictCardPaymentStratgegy());
        lot.parkVehicle(v4);

        Thread.sleep(1000);

        lot.leaveSlot(1, new CredictCardPaymentStratgegy());
        lot.leaveSlot(3, new DebitCardPaymentStratgegy());
    }
}
