package Elevator;
public class FistComeFirstServe implements ElevatorControllerStrategy {

    @Override
    public int determineNextStop(int floor) {
        System.out.println("Applying First Come First Serve Algorithm and Moving elevator to floor " + floor);
        //returning 1 for demo purposes, should be determining next stop and returning that
        return 1;
    }
    
}
