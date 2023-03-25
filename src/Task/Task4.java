package Task;

import java.util.Scanner;

public class Task4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Выберите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверная операция");
                return;
        }
        System.out.println("Результат: " + result);
    }
}