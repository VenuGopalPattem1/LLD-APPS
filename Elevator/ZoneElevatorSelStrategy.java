package Elevator;

public class ZoneElevatorSelStrategy implements ElevatorSelectionStrategy {
    @Override
    public int selectElevator(ExternalRequest er){
        System.out.println("Selecting elevator according to zone strategy and returning elevator id "+ er.getFloor()%10);
        return er.getFloor() % 10;
    }
    
}
