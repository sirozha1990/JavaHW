package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task {
    public static void main() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Заполнение списка рандомными числами
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println("Исходный список: " + numbers);

        // Нахождение минимального, максимального и среднего значения
        int min = numbers.get(0);
        int max = numbers.get(0);
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            sum += number;
        }
        double average = (double) sum / numbers.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
