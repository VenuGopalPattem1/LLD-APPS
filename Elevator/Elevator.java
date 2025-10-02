package Elevator;

public class Elevator {
    private int elevatorId;
    // private int currentFloor;
    private ElevatorController controller;

    public Elevator(){
        this.elevatorId = 0;
        this.controller = new ElevatorController();
    }

    public int getElevatorId() {
        return elevatorId;
    }
    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }
    public void setCurrentFloor(int floor) {
        controller.setCurrentFloor(floor);
    }
    public void moveElevator(int floor){
        controller.moveElevator(floor);
    }
}
