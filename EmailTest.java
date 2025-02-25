import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Date;
import java.awt.Image;

public class EmailTest {
    @Test
    void testSendEmailWithMockedUser() {
        // Create a mock User
        User mockUser = Mockito.mock(User.class);
        
        // Define mock behavior: when getEmail() is called, return a predefined email
        Mockito.when(mockUser.getEmail()).thenReturn("mockuser@example.com");

        // Create an Email object and use the mock user
        Email email = new Email();
        email.setRecipient(mockUser.getEmail());  // Uses mocked method
        email.setSubject("Hello");
        email.setBody("This is a test email.");

        // Assertions to verify the expected behavior
        assertEquals("mockuser@example.com", email.getRecipient());  // Now actually using the mock
        assertEquals("Hello", email.getSubject());
        assertEquals("This is a test email.", email.getBody());

        // Verify that getEmail() was actually called on the mockUser
        Mockito.verify(mockUser).getEmail();
    }
}
