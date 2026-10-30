package AdvCalc;

public class Eqt {

    public void solve(double a, double b, double c) {

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a quadratic equation.");
            return;
        }

        if (discriminant > 0) {

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);

        } else if (discriminant == 0) {

            double root = -b / (2 * a);
            System.out.println("Equal roots: " + root);

        } else {

            System.out.println("Roots are imaginary.");
        }
    }
}