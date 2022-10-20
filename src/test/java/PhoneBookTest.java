import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @Test
    public void addTest() {
        phoneBook = new PhoneBook();
        phoneBook.add(new String[]{"Petya", "89213845609"});

        int condition = phoneBook.add(new String[]{"Vasya", "89213845608"});
        Assertions.assertEquals(condition, 2);
    }

    @Test
    public void findByNumberTest() {
        phoneBook = new PhoneBook();
        phoneBook.add(new String[]{"Petya", "89213845609"});
        phoneBook.add(new String[]{"Vasya", "89213845608"});
        String condition = phoneBook.findByNumber("89213845608");
        Assertions.assertEquals(condition, "Vasya");
    }

    @Test
    public void findByNameTest() {
        phoneBook = new PhoneBook();
        phoneBook.add(new String[]{"Petya", "89213845609"});
        phoneBook.add(new String[]{"Vasya", "89213845608"});
        String condition = phoneBook.findByName("Vasya");
        Assertions.assertEquals(condition, "89213845608");
    }

    @Test
    public void printAllNamesTest() {
        phoneBook = new PhoneBook();
        phoneBook.add(new String[]{"Petya", "89213845609"});
        phoneBook.add(new String[]{"Anya", "89213845608"});

        Set<String> set = new TreeSet<>(String::compareTo);
        set.add("Petya");
        set.add("Anya");

        Set<String> condition = phoneBook.printAllNames();
        Assertions.assertEquals(condition, set);
    }
}
