package mod61ProjectOneMkostandin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void testContactCreationSuccess() {
        Contact contact = new Contact("JEDI001", "Obi-Wan", "Kenobi", "1234567890", "Jedi Temple, Coruscant");
        assertEquals("JEDI001", contact.getContactId());
        assertEquals("Obi-Wan", contact.getFirstName());
        assertEquals("Kenobi", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("Jedi Temple, Coruscant", contact.getAddress());
    }

    @Test
    void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("JEDI001_TOOLONG", "Obi-Wan", "Kenobi", "1234567890", "Coruscant"));
    }

    @Test
    void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("JEDI001", "Obi-Wan_Kenobi", "Kenobi", "1234567890", "Coruscant"));
    }

    @Test
    void testPhoneNotExactlyTenDigits() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("JEDI001", "Obi-Wan", "Kenobi", "123456789", "Coruscant"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("JEDI001", "Obi-Wan", "Kenobi", "12345678901", "Coruscant"));
    }

    @Test
    void testNullArguments() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Obi-Wan", "Kenobi", "1234567890", "Coruscant"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("JEDI001", null, "Kenobi", "1234567890", "Coruscant"));
    }
}