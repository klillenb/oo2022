package pr1;

import org.junit.*;
import static org.junit.Assert.*;

public class SnakeTest{
    GameCore core;
    @Before public void start(){
        core = new MyCore();
    }
    @Test public void testSnakeCoords(){
        int[][] places = core.snakeCoords();
        assertEquals(0, places[0][0]);
        assertEquals(0, places[0][1]);
    }

    @Test public void testRight(){
        core.right();
        core.step();
        int[][] places = core.snakeCoords();
        assertEquals(1, places[0][0]);
        assertEquals(0, places[0][1]);
        //kohandage oma klassi nõnda, et test läheks läbi
    }
}