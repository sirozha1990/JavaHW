package HW;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

import static task.reverseLinkedList.reverseLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        // добавление случайных элементов в список
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(10));
        }

        // отображение списка до переворота
        System.out.println("Список до переворота: " + list);

        // переворот списка
        LinkedList<Integer> reversedList = reverseLinkedList(list);

        // отображение списка после переворота
        System.out.println("Список после переворота: " + reversedList);
    }
}
