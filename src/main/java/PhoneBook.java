import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> bookNameToPhone;
    private Map<String, String> bookPhoneToName;
    private int count;

    public PhoneBook() {
        this.bookNameToPhone = new HashMap<>();
        this.bookPhoneToName = new HashMap<>();
        count = 0;
    }

    public int add(String[] contact) {
        if (contact.length != 2) {
            throw new RuntimeException("Неверное колличество элементов в массиве");
        }
        bookNameToPhone.put(contact[0], contact[1]);
        bookPhoneToName.put(contact[1], contact[0]);
        count++;
        return count;
    }

    public String findByNumber(String number) {
        return null;
    }
}
