import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingTest {
    @Test
    void testSetAndGetNumOfTickets() {
        Booking booking = new Booking();
        booking.setNumOfTickets(3);
        assertEquals(3, booking.getNumOfTickets());
    }
}
