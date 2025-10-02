package Elevator;
//singleton
//facade
public class ElevatorSystem {
    private int noOfElevators;
    private int noOfFloor;
    private static ElevatorSystem instance=null;
    private InternalRequestProcess iReq;
    private ExternalRequestProcess eReq;

    private ElevatorSystem(){
        iReq=new InternalRequestProcess();
        eReq=new ExternalRequestProcess();
    }

    public static ElevatorSystem getInstance(){
        if(instance==null){
            instance=new ElevatorSystem();
        }
        return instance;
    }


    public void intializeElevatorSystem(int noOfFloor,int noOfElevators){
        this.noOfElevators=noOfElevators;
        this.noOfFloor=noOfFloor;

        System.out.println("Initializing elevator system with " + noOfFloor + " floors and " + noOfElevators + " elevators!");
        System.out.println("--------------------------------------------------------");

        ElevatorMngr mng=ElevatorMngr.getInstance();
        mng.initializeElevatorMng(noOfElevators);
    }

    public void setElevatorSelStartegy(ElevatorSelectionStrategy ess){
        eReq.selectElevatorSelStrategy(ess);
    }
    public void preocessInternalReq(InternalRequest ir){
        iReq.processInternalRequest(ir);
    }

    public void preocessExternalReq(ExternalRequest er){
        eReq.processExternalRequest(er);
    }
}
