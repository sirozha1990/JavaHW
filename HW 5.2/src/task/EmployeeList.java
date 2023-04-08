package task;

import java.util.*;

public class EmployeeList {
    public static void main() {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Иван Иванов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Иван Иванов",
                "Мария Рыкова",
                "Анна Крутова",
                "Марина Лугова",
                "Анна Владимирова",
                "Петр Лыков",
                "Иван Мечников",
                "Петр Петин",
                "Петр Лыков",
                "Иван Ежов");

        Map<String, Integer> nameCount = new HashMap<>();
        for (String employee : employees) {
            if (!nameCount.containsKey(employee)) {
                nameCount.put(employee, 1);
            } else {
                nameCount.put(employee, nameCount.get(employee) + 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(nameCount.entrySet());
        sortedList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedList) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " повторений");
            }
        }
    }
}