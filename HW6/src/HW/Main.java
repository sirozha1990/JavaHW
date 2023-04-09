package HW;

import task.Notebook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("HP", 4, 500, "Windows 10", "Black", 500.0));
        notebooks.add(new Notebook("Dell", 8, 1000, "Windows 10", "Silver", 800.0));
        notebooks.add(new Notebook("Lenovo", 8, 500, "Windows 10", "Red", 600.0));
        notebooks.add(new Notebook("Asus", 16, 1000, "Windows 10", "White", 1200.0));

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filter = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет");
        int criteria = scanner.nextInt();
        switch (criteria) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int minRam = scanner.nextInt();
                filter.put("ram", minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int minHdd = scanner.nextInt();
                filter.put("hdd", minHdd);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filter.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filter.put("color", color);
                break;
            default:
                System.out.println("Некорректный ввод");
                return;
        }

        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            boolean isMatched = true;
            for (Map.Entry<String, Object> entry : filter.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                switch (key) {
                    case "ram":
                        if (notebook.getRam() < (int) value) {
                            isMatched = false;
                        }
                        break;
                    case "hdd":
                        if (notebook.getHdd() < (int) value) {
                            isMatched = false;
                        }
                        break;
                    case "os":
                        if (!notebook.getOs().equals(value)) {
                            isMatched = false;
                        }
                        break;
                    case "color":
                        if (!notebook.getColor().equals(value)) {
                            isMatched = false;
                        }
                        break;
                }
            }
            if (isMatched) {
                filteredNotebooks.add(notebook);
            }
        }

        System.out.println("Результаты фильтрации:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook.getModel() + " - " + notebook.getPrice());
        }
    }
}
