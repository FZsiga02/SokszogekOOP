package hu.petrik.oop;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető");
        }
    }

    @Override
    public void SetA(double a){
        super.setA(a);
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető");
        }
    }

    private boolean isSzerkesztheto() {
        boolean szerkesztheto = true;
        if ((this.getA() * this.b) <= this.getC() || (this.getA() * this.getC()) <= this.getB() || (this.getB() * this.getC()) <= this.getA()) {
            szerkesztheto = false;
        }
        return szerkesztheto;
    }

    public double getKerulet() {
        return this.getA() + this.getB() + this.getC();
    }

    private double getS() {
        return getKerulet() / 2;
    }

    public double getTerulet() {
        return Math.sqrt(this.getS() * (this.getS() - this.getA()) *
                (this.getS() - this.getB()) * (this.getS() - this.getC()));
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %f - b = %f - c = %f - K = %f - T = %f",
                this.getA(), this,getB(), this.getC(), this.getKerulet(), this.getTerulet());
    }
}
