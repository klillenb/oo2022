import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoogipudelTest {

    private Jook jook;
    private Joogipudel pudel;

    @BeforeEach
    void setUp() {
        jook = new Jook("vesi", 1, 1.0);
        pudel = new Joogipudel(1.0, "plastik", 0.2, jook);
    }

    @Test
    void testPudeliMass() {
        //then
        assertEquals(1.2, pudel.pudeliMass());
    }

    @Test
    void testHind() {
        //then
        assertEquals(1.1, pudel.hind());
    }
}