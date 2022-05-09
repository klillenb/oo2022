import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeenTest {

    private Alleel alleel1, alleel2;
    private Geen geen;

    @Test
    void testOnOlemas() {
        // given
        alleel1 = new Alleel("reesus", true);
        alleel2 = new Alleel("reesus", false);
        geen = new Geen(alleel1, alleel2);

        // when
        boolean geeniOlemasolu = geen.onOlemas();

        // then
        assertEquals(true, geeniOlemasolu);
    }

    @Test
    void testEiOleOlemas() {
        // given
        alleel1 = new Alleel("reesus", false);
        alleel2 = new Alleel("reesus", false);
        geen = new Geen(alleel1, alleel2);

        // when
        boolean geeniOlemasolu = geen.onOlemas();

        // then
        assertEquals(false, geeniOlemasolu);
    }

    @Test
    void testOnOlemasErinevNimetus() {
        // given
        alleel1 = new Alleel("A", true);
        alleel2 = new Alleel("reesus", false);
        geen = new Geen(alleel1, alleel2);

        // when
        boolean geeniOlemasolu = geen.onOlemas();

        // then
        assertEquals(false, geeniOlemasolu);
    }
}