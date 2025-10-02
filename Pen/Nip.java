package Pen;

public class Nip {
    private double size;
    public Nip(double size){
        this.size=size;
    }
    public double getsize() {
        return size;
    }

    @Override
    public String toString() {
        return "Nip{ size=" + size + "}";
    }

}
