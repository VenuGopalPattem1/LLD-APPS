package ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private static ParkingLot instance;
    private ParkingSlot[] pSlots;
    private ParkingStrategy parkingStrategy;
    // private PaymentStratgegy paymentStratgegy;

    private Map<String, Long> entryTime;

    private ParkingLot(int capacity, ParkingStrategy ps) {
        pSlots = new ParkingSlot[capacity];
        for (int i = 0; i < capacity; i++) {
            pSlots[i] = new ParkingSlot(i + 1);
        }
        parkingStrategy = ps;
        entryTime = new HashMap<>();
    }

    public static ParkingLot getInstance(int capacity, ParkingStrategy strategy) {
        if (instance == null) {
            instance = new ParkingLot(capacity, strategy);
        }
        return instance;
    }

    public ParkingSlot parkVehicle(Vehicle v) {
        ParkingSlot slot = parkingStrategy.getParkingLot(pSlots);
        if (slot == null) {
            System.out.println("No free slot available for vehicle " + v.getNumber());
            return null;
        }
        slot.park(v);
        entryTime.put(v.getNumber(), System.currentTimeMillis());
        System.out.println(v.getType() + " " + v.getNumber() + " parked at slot " + slot.getId());
        return slot;
    }

    public void leaveSlot(int slotId, PaymentStratgegy paymentMethod) {
        if (slotId <= 0 || slotId > pSlots.length) {
            System.out.println("Invalid slot id");
            return;
        }
        ParkingSlot slot = pSlots[slotId - 1];//1 based indexing 
        Vehicle v = slot.getVehicle();
        if (v == null) {
            System.out.println("Slot " + slotId + " is already free");
            return;
        }

        long start = entryTime.getOrDefault(v.getNumber(), System.currentTimeMillis());
        long hours = (System.currentTimeMillis() - start) / (1000 * 60 * 60) + 1; // round up
        PaymentService paymentService = new PaymentService(paymentMethod);
        double fee = paymentService.calculateFee(hours, v);

        if (slot.leave()) {
            paymentService.pay(v.getNumber(), fee);
            entryTime.remove(v.getNumber());
            System.out.println("Slot " + slotId + " is now free");
        }
    }
}
