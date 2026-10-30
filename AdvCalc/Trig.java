package AdvCalc;

public class Trig {

    private static final double PI = 3.141592653589793;

    public double sin(double angle) {
        return Math.sin(angle * PI / 180);
    }

    public double cos(double angle) {
        return Math.cos(angle * PI / 180);
    }

    public double tan(double angle) {
        return Math.tan(angle * PI / 180);
    }
}