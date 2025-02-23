import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {
    @Test
    void testSendEmailWithMockedUser() {
        User mockUser = Mockito.mock(User.class);
        Email email = new Email();
        
        email.setRecipient("test@example.com");
        email.setSubject("Hello");
        email.setBody("This is a test email.");
        
        assertEquals("test@example.com", email.getRecipient());
        assertEquals("Hello", email.getSubject());
        assertEquals("This is a test email.", email.getBody());
    }
}
