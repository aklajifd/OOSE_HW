import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AIRecommendationTest {
    @Test
    void testSetAndGetID() {
        AIRecommendation recommendation = new AIRecommendation();
        recommendation.setID(42);
        assertEquals(42, recommendation.getID());
    }
}
