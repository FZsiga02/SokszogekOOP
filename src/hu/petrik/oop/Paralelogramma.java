package hu.petrik.oop;

public class Paralelogramma extends Teglalap{
    private double magassag;

    public Paralelogramma(double a, double b, double magassag) {
        super(a, b);
        this.magassag = magassag;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    public double getKerulet(){
        return this.getA()*this.magassag;
    }

    public double getTerulet(){
        return 2 * (this.getA() + this.getB());
    }

    @Override
    public String toString() {
        return String.format("Paralelogramma: a = %f - b = %f - m = %s",
                this.getA(), this.getB(), super.toString());
    }
}
