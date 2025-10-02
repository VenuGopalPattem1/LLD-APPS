package Elevator;

public class InternalRequestProcess {
    public void processInternalRequest(InternalRequest ir){
        ElevatorMngr em = ElevatorMngr.getInstance();
        Elevator e = em.getElevator(ir.getSrcElvId());
        // e.setElevatorId(ir.getSrcElvId());
        // e.setCurrentFloor(ir.getDstFloor());
        e.moveElevator(ir.getDstFloor());
    }
}
