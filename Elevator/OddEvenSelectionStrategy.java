package Elevator;

public class OddEvenSelectionStrategy implements ElevatorSelectionStrategy {
    @Override
    public int selectElevator(ExternalRequest er) {
        System.out.print("Selecting elevator according to odd-even strategy and returning elevator id ");
        int floor = er.getFloor();
        if(floor % 2 == 0){
            System.out.println("0 (even)");
            return 0; // even elevator
        } else {
            System.out.println("1 (odd)");
            return 1; // odd elevator
        }
    }

}
