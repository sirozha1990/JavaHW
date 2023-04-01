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

        // Удаление четных чисел
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--; // чтобы не пропустить следующий элемент после удаления
            }
        }

        System.out.println("Список без четных чисел: " + numbers);
    }
}