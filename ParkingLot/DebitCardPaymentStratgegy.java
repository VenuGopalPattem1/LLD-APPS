package ParkingLot;

public class DebitCardPaymentStratgegy implements PaymentStratgegy{

    @Override
    public void pay(String carNo, double amount) {
        System.out.println("payment for the parking of the car with no "+carNo+" the amont is paid "+amount+" using DebitCardPaymentStratgegy");

    }
    
}
