package Elevator;

public class InternalRequest {
    private int dstFloor;
    private int srcElvId;

    public InternalRequest(int dstFloor,int srcElvId){
        this.dstFloor=dstFloor;
        this.srcElvId=srcElvId;
    }
    public void setDstFloor(int dst){
        this.dstFloor = dst;
    }
    public int getDstFloor(){
        return dstFloor;
    }
    public void setSrcElvId(int srcElvId){
        this.srcElvId = srcElvId;
    }
    public int getSrcElvId(){
        return srcElvId;
    }
}
