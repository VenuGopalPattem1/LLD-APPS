package Elevator;

public class ElevatorController {
    private ElevatorCurrState status;
    private ElevatorControllerStrategy strategy;

    public ElevatorController(){
        status = new ElevatorCurrState();
    }

    public void setCurrentFloor(int floor) {
        status.setCurrentFloor(floor);
    }

    public void moveElevator(int floor){
        strategy=new FistComeFirstServe();;
        int nextStop = strategy.determineNextStop(floor);
        if(nextStop > status.getCurrentFloor()){
            status.setDirection(ElevatorDirection.UP);
        } else if (nextStop < status.getCurrentFloor()){
            status.setDirection(ElevatorDirection.DOWN);
        } else {
            status.setDirection(ElevatorDirection.IDLE);
        }
    }
}
