import java.util.Scanner;

public class HwCalcRect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        double a = scanner.nextDouble();
        System.out.println("Введите b");
        double b = scanner.nextDouble();
        System.out.println("Введите c");
        double c = scanner.nextDouble();
        System.out.println("Площадь: " + calcRect(a, b, c));
    }

    private static double calcRect(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}