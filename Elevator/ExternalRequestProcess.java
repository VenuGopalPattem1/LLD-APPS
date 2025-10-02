package Elevator;

public class ExternalRequestProcess {
    private ElevatorSelectionStrategy ess;
    public ExternalRequestProcess(){
        ess=new OddEvenSelectionStrategy();
    }

    public void selectElevatorSelStrategy(ElevatorSelectionStrategy ess){
        this.ess = ess;
    }

    public void processExternalRequest(ExternalRequest er){
        int elvId = ess.selectElevator(er);
        ElevatorMngr em = ElevatorMngr.getInstance();
        Elevator e = em.getElevator(elvId);
        // e.set(elvId);
        // System.out.println("External request for floor " + er.getFloor() + " in direction
        e.moveElevator(er.getFloor());

    }
}
