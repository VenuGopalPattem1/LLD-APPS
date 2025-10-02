package Elevator;

import java.util.HashMap;
import java.util.Map;
//singleton
public class ElevatorMngr {
    private static ElevatorMngr Instance = null;
    private Map<Integer,Elevator> m;

    private ElevatorMngr(){
        m = new HashMap<>();
    }

    public static ElevatorMngr getInstance(){
        if(Instance == null){
            Instance = new ElevatorMngr();
        }
        return Instance;
    }
    public void initializeElevatorMng(int noOfElevatomaxFloor){
        for(int i=0;i<=noOfElevatomaxFloor;i++){
            m.put(i,new Elevator());
        }
    }

    public Elevator getElevator(int id){
        return m.get(id);
    }
}
