package hu.petrik.oop;

import java.util.ArrayList;
import java.util.Random;


public class Sokszogek {
    private static ArrayList<Sokszog> sokszogek = new ArrayList<>();

    public Sokszogek() {
        Random rnd = new Random();
        int sokszog = rnd.nextInt(4) + 1;
        if (sokszog == 1) {
            sokszogek.add(new Teglalap(Math.random() * 10 + 5, Math.random() * 10 + 5));
        } else if (sokszog == 2) {
            sokszogek.add(new Paralelogramma(Math.random() * 10 + 5, Math.random() * 10 + 5, Math.random() * 10 + 5));
        } else if (sokszog == 3) {
            sokszogek.add(new Haromszog());
        } else {
            sokszogek.add(new Haromszog());
        }
    }

    public static double osszTerulet() {
        double t = 0;
        for (Sokszog sokszog : sokszogek) {
            t += sokszog.getTerulet();
        }
        return t;
    }

    public static double osszKerulet() {
        double k = 0;
        for (Sokszog sokszog : sokszogek) {
            k += sokszog.getKerulet();
        }
        return k;
    }

    public static double maxTerulet() {
        double max = 0;
        for (Sokszog sokszog : sokszogek) {
            if (sokszog.getTerulet() > max) {
                max = sokszog.getTerulet();
            }
        }
        return max;
    }

    public static String kiiras() {
        return sokszogek.get(sokszogek.size() - 1).toString();
    }

    public static String listaKiir() {
        return String.format("Lista: Összkerület = %-10.3f, Összterület = %-10.3f, Max Terület: %-10.3f", osszKerulet(), osszTerulet(), maxTerulet());
    }

    @Override
    public String toString() {
        return String.format("Lista: Összkerület = %-10.3f, Összterület = %-10.3f, Max Terület: %-10.3f", osszKerulet(), osszTerulet(), maxTerulet());
    }
}
