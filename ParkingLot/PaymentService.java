package ParkingLot;

public class PaymentService {
    private PaymentStratgegy stratgegy;

    public PaymentService(PaymentStratgegy p) {
        stratgegy = p;
    }

    public double calculateFee(long hours, Vehicle v) {
        double baseRate;
        switch (v.getType()) {
            case "bike":
                baseRate = 10;
                break;
            case "car":
                baseRate = 20;
                break;
            case "truck":
                baseRate = 50;
                break;
            default:
                baseRate = 20;
        }
        return baseRate * hours;
    }

    public void pay(String vehicleNumber, double amount) {
        stratgegy.pay(vehicleNumber, amount);
    }
}
