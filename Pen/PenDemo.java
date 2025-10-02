package Pen;


public class PenDemo {
    public static void main(String[] args) {
        Pen pen=new Pen.Builder()
                .setName("Classic BallPen")
                .setPrice(20)
                .setBrand("Reynolds")
                .setType(PenType.BALL)
                .setInk(new Ink("RED",10))
                .setNip(new Nip(3))
                .setWrirtin(new SmoothStrategyWriter())
                .build();

        // pen.write("hellow world");
        pen.capOff();
        pen.write("this time pen cap id off");
        pen.write("hii");
        pen.write("java");
        // System.out.println(pen);
    }
}
