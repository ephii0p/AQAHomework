import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи
        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Иванов", "123-4567");
        phoneBook.add("Петров", "123-45678");
        phoneBook.add("Сидоров", "123-456789");
        phoneBook.add("Валуев", "123-4567890");
        phoneBook.add("Неизвестный", "123-45678901");

        // Получаем номера по фамилии
        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны Валуев: " + phoneBook.get("Валуев"));
        System.out.println("Телефоны Неизвестного: " + phoneBook.get("Неизвестный"));
    }
}