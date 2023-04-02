package task;

import java.util.*;

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