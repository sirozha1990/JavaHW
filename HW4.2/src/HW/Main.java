package HW;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

import task.Queue;

public class Main {
    public static void main(String[] args) {
        task.Queue<String> queue = new Queue<>();

        // добавление элементов в очередь
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");

        // отображение первого элемента в очереди
        System.out.println("Первый элемент в очереди: " + queue.first());

        // удаление первого элемента из очереди
        String element = queue.dequeue();
        System.out.println("Удаленный элемент: " + element);

        // отображение первого элемента в очереди после удаления
        System.out.println("Первый элемент в очереди: " + queue.first());
    }
}



