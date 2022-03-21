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

    @Test public void testMovement(){
        core.up();
        core.step();
        core.step();
        core.left();
        core.step();
        int[][] places = core.snakeCoords();
        assertEquals(-1, places[0][0]);
        assertEquals(2, places[0][1]);
        core.down();
        core.step();
        places = core.snakeCoords();
        assertEquals(-1, places[0][0]);
        assertEquals(1, places[0][1]);
    }

    @Test public void specifyFoodPlace(){
        int[] place = {3, 2};
        core.foodCoord(place);
        int[] newPlace = core.foodCoord();
        assertArrayEquals(place, newPlace);
        place[0] = 5;
        place[1] = 7;
        core.foodCoord(place);
        newPlace = core.foodCoord();
        assertArrayEquals(place, newPlace);

    }

    @Test public void testHit(){
        int[] place = {1, 0};
        core.foodCoord(place);
        core.right();
        core.step();
        int[][] places = core.snakeCoords();
        boolean hit = core.hasHit();
        assertTrue(hit);
    }
}