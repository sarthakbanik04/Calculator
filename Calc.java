import AdvCalc.*;
import java.util.Scanner;

public class Calc {

    private static final String CALCULATOR_NAME = "Java Calculator";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Trig trig = new Trig();
        Matrix matrix = new Matrix();
        Eqt equation = new Eqt();

        int choice;

        System.out.println("================================");
        System.out.println("       " + CALCULATOR_NAME);
        System.out.println("================================");

        do {
            System.out.println("\n------ CALCULATOR MENU ------");
            System.out.println("1. Basic Arithmetic");
            System.out.println("2. Trigonometry");
            System.out.println("3. Matrix Addition");
            System.out.println("4. Quadratic Equation");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();

                    System.out.println("Addition: " + add(a, b));
                    System.out.println("Subtraction: " + subtract(a, b));
                    System.out.println("Multiplication: " + multiply(a, b));
                    System.out.println("Division: " + divide(a, b));
                    break;

                case 2:
                    System.out.print("Enter angle in degrees: ");
                    double angle = sc.nextDouble();

                    System.out.println("Sine: " + trig.sin(angle));
                    System.out.println("Cosine: " + trig.cos(angle));
                    System.out.println("Tangent: " + trig.tan(angle));
                    break;

                case 3:
                    int[][] A = new int[2][2];
                    int[][] B = new int[2][2];

                    System.out.println("Enter elements of Matrix A:");

                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            A[i][j] = sc.nextInt();
                        }
                    }

                    System.out.println("Enter elements of Matrix B:");

                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            B[i][j] = sc.nextInt();
                        }
                    }

                    System.out.println("Matrix Addition Result:");
                    matrix.addMatrices(A, B);
                    break;

                case 4:
                    System.out.print("Enter coefficient a: ");
                    double x = sc.nextDouble();

                    System.out.print("Enter coefficient b: ");
                    double y = sc.nextDouble();

                    System.out.print("Enter coefficient c: ");
                    double z = sc.nextDouble();

                    equation.solve(x, y, z);
                    break;

                case 5:
                    System.out.println("Thank you for using Java Calculator!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }

        return (double) a / b;
    }
}