import java.util.*;

public class PhoneBook {
    private final Map<String, String> bookNameToPhone;
    private final Map<String, String> bookPhoneToName;
    private int count;

    public PhoneBook() {
        this.bookNameToPhone = new TreeMap<>(String::compareTo);
        this.bookPhoneToName = new TreeMap<>();
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
        return bookPhoneToName.get(number);
    }

    public String findByName(String name) {
        return bookNameToPhone.get(name);
    }

    public Set<String> printAllNames() {
        Set<String> list = this.bookNameToPhone.keySet();
        System.out.println(list);
        return list;
    }

}
