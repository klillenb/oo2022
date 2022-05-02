import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoogivaatTest {

    private Jook jook;
    private Joogipudel pudel;
    private Joogivaat vaat;

    @BeforeEach
    void setUp() {
        jook = new Jook("vesi", 1, 1.0);
        pudel = new Joogipudel(1.0, "plastik", 0.2, jook);
        vaat = new Joogivaat(200.0, 150.0, jook);
    }

    @Test
    void testTaidaPudel() {
        //then
        assertEquals(1.0, vaat.taidaPudel(pudel));
    }

    @Test
    void testVillimine() {
        //then
        assertEquals(150.0, vaat.villimine(pudel));
    }
}