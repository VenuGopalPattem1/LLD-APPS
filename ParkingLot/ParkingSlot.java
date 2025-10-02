package ParkingLot;

public class ParkingSlot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public ParkingSlot(int id){
        this.id=id;
        isFree=true;
    }

    public boolean park(Vehicle v){
        if(isFree){
            vehicle=v;
            isFree=false;
            return true;
        }
        return false;
    }

    public boolean leave(){
        if(!isFree){
            vehicle=null;
            isFree=true;
            return true;
        }
        return false;
    }
    public int getId() {
        return id;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public boolean isFree() {
        return isFree;
    }
}
