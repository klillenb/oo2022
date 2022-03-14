import java.util.*;

public class CoreStarter{
    GameCore starter;
    public CoreStarter(GameCore newStarter){
        starter = newStarter;
        new Timer().scheduleAtFixedRate(new TimerTask(){
            public void run(){
                //System.out.println("Käivitub");
                starter.step();
                System.out.println(Arrays.deepToString(starter.snakeCoords()) +
                " " + Arrays.toString(starter.foodCoord()));
            }
        }, 0, 2000);
    }
}