import java.util.Scanner;

public class HwCalcCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите l");
        double l = scanner.nextDouble();
        System.out.println("Площадь: " + calcCircle(l));
    }
    private static double calcCircle(double l) {
        return l*l/4*Math.PI;
    }
}
