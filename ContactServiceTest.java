package mod61ProjectOneMkostandin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
    private ContactService service;

    @BeforeEach
    void setUp() {
        service = new ContactService();
    }

    @Test
    void testAddContact() {
        Contact contact = new Contact("SITH001", "Darth", "Vader", "0987654321", "Mustafar System");
        service.addContact(contact);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact)); // Duplicate check
    }

    @Test
    void testDeleteContact() {
        Contact contact = new Contact("SITH001", "Darth", "Vader", "0987654321", "Mustafar System");
        service.addContact(contact);
        service.deleteContact("SITH001");
        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("SITH001")); // Already deleted
    }

    @Test
    void testUpdateContact() {
        Contact contact = new Contact("SITH001", "Anakin", "Skywalker", "0987654321", "Tatooine");
        service.addContact(contact);
        service.updateContact("SITH001", "Darth", "Vader", "1112223333", "Death Star");
        
        // Updating non-existent contact
        assertThrows(IllegalArgumentException.class, () -> service.updateContact("REBEL01", "Luke", "Skywalker", "1231231234", "Hoth"));
    }
}