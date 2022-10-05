package hu.petrik.oop;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;
            System.out.println(new Teglalap(a,b));
        }
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;
            double m = Math.random() * 10 + 5;
            System.out.println(new Paralelogramma(a,b,m));
        }
        for (int i = 0; i < 5; i++) {
            new Sokszogek();
            System.out.println(Sokszogek.kiiras());
        }
        System.out.println(Sokszogek.listaKiir());
    }
}
