package Task;

import java.util.Scanner;

public class Task2 {
        public static void main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int n = scanner.nextInt();
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }
    }
