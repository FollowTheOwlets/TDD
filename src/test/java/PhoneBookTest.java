import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @Test
    public void testAdd() {
        phoneBook = new PhoneBook();
        phoneBook.add(new String[]{"Petya", "89213845609"});

        int condition = phoneBook.add(new String[]{"Petya", "89213845609"});
        Assertions.assertEquals(condition, 2);
    }
}
