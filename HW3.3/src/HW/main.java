package HW;

import Task.task;

public class main {
    public static void main(String[] args) {
        task task = new task();
        Task.task.main();
    }
}



package HW;
//Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов и у человека уникальное имя.

import task.PhoneBook;

public class main {
    public static void main(String[] args) {
        PhoneBook PhoneBook = new PhoneBook();
        task.PhoneBook.main();

    }
}



public class PhoneBook {

    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phone);
    }

    public List<String> getPhonesByName(String name) {
        return phoneBook.getOrDefault(name, Collections.emptyList());
    }

    public void removeContact(String name) {
        phoneBook.remove(name);
    }

    public static void main() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Viktor", "1234567890");
        phoneBook.addContact("Viktor", "0987654321");
        phoneBook.addContact("Masha", "5555555555");

        List<String> viktorPhones = phoneBook.getPhonesByName("Viktor");
        System.out.println("Viktor's phones: " + viktorPhones);

        phoneBook.removeContact("Masha");

        List<String> mashaPhones = phoneBook.getPhonesByName("Masha");
        System.out.println("Masha's phones: " + mashaPhones);
    }
}