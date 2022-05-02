import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KastTest {

    private Jook jook;
    private Joogipudel pudel;
    private Joogivaat vaat;
    private Kast kast;

    @BeforeEach
    void setUp() {
        jook = new Jook("vesi", 1, 1.0);
        pudel = new Joogipudel(1.0, "plastik", 0.2, jook);
        vaat = new Joogivaat(200.0, 150.0, jook);
        kast = new Kast("plastik", 5.0, 2.5, 12);
    }


    @Test
    void testKoguMass() {
        //then
        assertEquals(16.9, kast.koguMass(pudel));
    }

    @Test
    void testKoguHind() {
        //then
        assertEquals(18.2, kast.koguHind(pudel));
    }

    @Test
    void testVillimine() {
        //then
        assertEquals(1800, kast.villimine(vaat, pudel));
    }
}