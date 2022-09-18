package funcCalc;

import java.util.Scanner;

public class HwCalcFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        double x = scanner.nextDouble();
        System.out.println("Введите y");
        double y = scanner.nextDouble();
        System.out.println("f1: " + calcf1(x, y));
        System.out.println("f2: " + calcf2(x, y));
    }

    private static double calcf1(double x, double y) {
        if (x > y) {
            return x - y;
        }
        return y - x + 1;
    }

    private static double calcf2(double x, double y) {
        if (x < 0) {
            return -x;
        }
        return -x * x;
    }
}
