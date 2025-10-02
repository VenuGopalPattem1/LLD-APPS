package Elevator;

public class ElevatorCurrState {
    private int currentFloor;
    private ElevatorDirection direction;
    private ElevatorStatus status;

    public ElevatorCurrState(){
        currentFloor = 0;
        direction = ElevatorDirection.IDLE;
        status = ElevatorStatus.IDLE;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentFloor(int floor) {
        currentFloor = floor;
    }
    public ElevatorDirection getDirection() {
        return direction;
    }
    public void setDirection(ElevatorDirection dir) {
        direction = dir;
    }
    public ElevatorStatus getStatus() {
        return status;
    }
    public void setStatus(ElevatorStatus sta) {
        status = sta;
    }
}
