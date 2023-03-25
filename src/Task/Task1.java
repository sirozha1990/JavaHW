package Task;

import java.util.Scanner;

public class Task1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int triangle = triangleNumber(n);
        System.out.println("n-ое треугольное число: " + triangle);
    }

    public static int triangleNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}
