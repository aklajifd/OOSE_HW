import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Date;
import java.awt.Image;

public class BookingTest {
    @Test
    void testSetAndGetNumOfTickets() {
        Booking booking = new Booking();
        booking.setNumOfTickets(3);
        assertEquals(3, booking.getNumOfTickets());
    }
}
