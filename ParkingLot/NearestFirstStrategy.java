package ParkingLot;

public class NearestFirstStrategy implements ParkingStrategy {

    @Override
    public ParkingSlot getParkingLot(ParkingSlot[] slots) {
        for (ParkingSlot slot : slots) {
            if (slot.isFree())
                return slot;
        }
        return null;
    }

}
