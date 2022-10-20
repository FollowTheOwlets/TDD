import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @Test
    public void testAdd() {
        phoneBook = new PhoneBook();
        phoneBook.add(new String[]{"Petya", "89213845609"});

        int condition = phoneBook.add(new String[]{"Vasya", "89213845608"});
        Assertions.assertEquals(condition, 2);
    }

    @Test
    public void findByNumber() {
        phoneBook = new PhoneBook();
        phoneBook.add(new String[]{"Petya", "89213845609"});
        phoneBook.add(new String[]{"Vasya", "89213845608"});
        String condition = phoneBook.findByNumber("89213845608");
        Assertions.assertEquals(condition, "Vasya");
    }
}
