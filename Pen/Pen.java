package Pen;

public class Pen implements IPenObserver{
    protected String name;
    protected int price;
    protected String brand;
    protected PenType type;
    protected boolean isCap;
    protected Nip nip;
    protected Ink ink;
    protected StartegyWritin wrirtin;

    public Pen(Builder b) {
        this.name = b.name;
        this.price = b.price;
        this.brand = b.brand;
        this.type = b.type;
        this.wrirtin = b.wrirtin;
        this.isCap = true;
        this.nip = b.nip;
        this.ink = b.ink;
        if(this.ink!=null){
             this.ink.add(this);
        }
    }

    public boolean capOff() {
        isCap = false;
        return isCap;
    }

    public boolean capOn() {
        isCap = true;
        return isCap;
    }


    public void write(String text) {
        if (isCap) {
            System.out.println(name + " its cap is on we cant write when cap is on");
            return;
        }
        wrirtin.write(text,ink,nip);
    }

      @Override
    public void lowInk(int quantity) {
        System.out.println(name+" ink quantity is very Low "+quantity);
    }

    @Override
    public void emptyInk() {
        System.out.println(name+" has no more ink present you cant write");
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", isCap=" + isCap +
                ", nip=" + (nip != null ? nip.toString() : "none") +
                ", ink=" + (ink != null ? ink.toString() : "none") +
                '}';
    }
    //builder dp
    public static class Builder {
        protected String name;
        protected int price;
        protected String brand;
        protected PenType type;
        protected boolean isCap;
        protected Nip nip;
        protected Ink ink;
        protected StartegyWritin wrirtin;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setType(PenType type) {
            this.type = type;
            return this;
        }

        public Builder setNip(Nip nip) {
            this.nip = nip;
            return this;
        }

        public Builder setInk(Ink ink) {
            this.ink = ink;
            return this;
        }

        public Builder setWrirtin(StartegyWritin wrirtin) {
            this.wrirtin = wrirtin;
            return this;
        }

        public Pen build() {
            switch (type) {
                case GELL:
                    return new GelPen(this);
                case BALL:
                    return new BallPen(this);
                case FOUTAIN:
                    return new FoutainPen(this);
                default:
                    throw new IllegalArgumentException("Unknown pen type: " + type);
            }
        }

    }
  

}
