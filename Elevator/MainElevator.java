package Elevator;

public class MainElevator {
    public static void main(String[] args) {
        ElevatorSystem sys=ElevatorSystem.getInstance();
        sys.intializeElevatorSystem(12,4);

        sys.setElevatorSelStartegy(new ZoneElevatorSelStrategy());


        System.out.println("--------------------------------------------------------");
        // Press external button from floor 10 to come down
        sys.preocessExternalReq(new ExternalRequest(ElevatorDirection.DOWN, 10));

        System.out.println("--------------------------------------------------------");

         // Press internal button to move to floor 7 in elevator 4 
        sys.preocessInternalReq(new InternalRequest(10,2));
        System.out.println("--------------------------------------------------------");

        sys.preocessInternalReq(new InternalRequest(15,3));
        System.out.println("--------------------------------------------------------");

 

    }
}
