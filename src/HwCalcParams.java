import java.util.Scanner;

public class HwCalcParams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        double x = scanner.nextDouble();
        System.out.println("Введите y");
        double y = scanner.nextDouble();
        System.out.println("Введите z");
        double z = scanner.nextDouble();
        System.out.println("a: " + calca(x, y, z));
        System.out.println("b: " + calcb(x, y, z));
    }

    private static double calca(double x, double y, double z) {
        return (3 + Math.pow(Math.E, y - 1)) / (1 + x * x * Math.abs(y - Math.tan(z)));
    }

    private static double calcb(double x, double y, double z) {
        return 1 + Math.abs(y - x) + Math.pow(y - x, 2) / 2 + Math.pow(Math.abs(y - x), 3) / 3;
    }
}
