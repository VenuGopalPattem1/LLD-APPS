package Elevator;

public class ExternalRequest {
    private ElevatorDirection direction;
    private int srcFloor;

    public ExternalRequest(ElevatorDirection di,int srcFloor){
        direction=di;
        this.srcFloor=srcFloor;
    }
    public void setDirection(ElevatorDirection direction){
        this.direction = direction;
    }   
    public ElevatorDirection getDirection(){
        return direction;
    }
    public void setFloor(int floor){
        this.srcFloor = floor;
    }
    public int getFloor(){
        return srcFloor;
    }
}
