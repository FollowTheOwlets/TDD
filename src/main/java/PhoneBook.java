import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public int add(String[] contact) {
        if (contact.length != 2) {
            throw new RuntimeException("Неверное колличество элементов в массиве");
        }
        book.put(contact[0], contact[1]);
        return book.size();
    }
}
