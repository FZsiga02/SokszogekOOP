package hu.petrik.oop;

public class Paralelogramma extends Teglalap{
    private double szog;

    public Paralelogramma(double a, double b, double szog) {
        super(a, b);
        this.szog = szog;
    }

    public double getSzog() {
        return szog;
    }

    public void setSzog(double szog) {
        this.szog = szog;
    }

    public double getKerulet(){

    }

    public double getTerulet(){

    }

    @Override
    public String toString() {
        return "";
    }
}
